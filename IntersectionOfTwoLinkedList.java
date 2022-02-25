package solved;

public class IntersectionOfTwoLinkedList {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		 if(headA==null) return null;
	        if(headB==null) return null;
	       int a=size(headA);
	        int b=size(headB);
	        ListNode tmpA=headA , tmpB=headB;
	        if(a<b)
	        {
	            tmpA=headB;
	            tmpB=headA;
	        }
	        for(int i=0;i<Math.abs(a-b);i++)
	            tmpA=tmpA.next;
	        while(tmpA!=null && tmpB!=null)
	        {
	            if(tmpA==tmpB) return tmpA;
	            tmpA=tmpA.next;
	            tmpB=tmpB.next;
	        }
	        return null;
	        		
	    } 
	 int size(ListNode head){
	        ListNode cur=head;
	        int count=0;
	        while(cur!=null)
	        {
	            cur=cur.next;
	            count++;
	        }
	        return count;
	    }
}
