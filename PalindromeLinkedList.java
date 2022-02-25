package solved;

public class PalindromeLinkedList {

	public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
         ListNode mid=middle(head);
         ListNode halfmid=reverse(mid.next);
        mid.next=null;
        while(head!=null && halfmid!=null)
        {
            if(head.val != halfmid.val) return false;
            head=head.next;
            halfmid=halfmid.next;
        }
        return true;
    }
     ListNode reverse( ListNode head)
     {
          ListNode cur=head, pre=null, tmp=null;
         while(cur!=null)
         {
             tmp=cur.next;
             cur.next=pre;
             pre=cur;
             cur=tmp;
         }
         return pre;
     }
    ListNode middle(ListNode head)
    {
        ListNode slow=head, fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
