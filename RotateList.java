package solved;

public class RotateList {

	 public ListNode rotateRight(ListNode head, int k) {
	        if(head==null || k==0)
	            return head;
	        int size=1;
	        ListNode tmp=head;
	        while(tmp.next!=null)
	        {    
	            tmp=tmp.next;
	            size++;
	        }
	        
	        k=size-(k%size);
	        ListNode cur=head;
	        while(k>1)
	        {
	            cur=cur.next;
	            k--;
	        }
	        tmp.next=head;
	        head=cur.next;
	        cur.next=null;
	            
	        return head;
	        
	    }
}
