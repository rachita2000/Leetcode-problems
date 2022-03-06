package solved;

public class MergeKSortedLists {

	public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        return mergeSort(lists, 0, lists.length-1);
    }
    private ListNode mergeSort(ListNode[] lists, int start, int end)
    {
        if(start==end) return lists[start];
        int mid= start+(end-start)/2;
        ListNode firstHalf=mergeSort(lists, start, mid);
        ListNode lastHalf=mergeSort(lists, mid+1, end);
        
        return merge(firstHalf, lastHalf);
    }
    
    private ListNode merge(ListNode l1, ListNode l2)
    {
        ListNode tmp=new ListNode(-1);
        ListNode head=tmp;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                tmp.next=l1;
                l1=l1.next;
            }
            else
            {
                tmp.next=l2;
                l2=l2.next;
            }
            tmp=tmp.next;
        }
        
        if(l1!=null)
        {
            tmp.next=l1;
        }
       else
        {
            tmp.next=l2;
        }
        
        return head.next;
    }
}
