package solved;

public class SortList {

	 public ListNode sortList(ListNode head) {
	        if(head==null || head.next==null) return head;
	        ListNode mid=midNode(head);
	        ListNode left=sortList(head);
	        ListNode right=sortList(mid);
	        
	        return mergeSort(left, right);
	    }
	    
	    private ListNode mergeSort(ListNode left, ListNode right) {
		
	    	if(left==null) return right;
	    	if(right==null) return left;
	    	
	    	if(left.val<right.val)
	    		{
	    			left.next=mergeSort(left.next, right);
	    			return left;
	    		}
	    	else 
	    		{
	    			right.next=mergeSort(left, right.next);
	    			return right;
	    		}
	}

		private ListNode midNode(ListNode head)
	    {
	        ListNode slow=head, fast=head.next;
	        while(fast!=null && fast.next!=null)
	        {
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        ListNode mid=slow.next;
	        slow.next=null;
	        return mid;
	    }
}
