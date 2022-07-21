package solved;

public class ReverseLinkedListII {

	 public ListNode reverseBetween(ListNode head, int left, int right) {
         if(head.next==null)
      return head;
  
	  // Reach to left node and take care of its previous node for attaching at the end
	  ListNode newHead=head;
	  ListNode prev=null;
	  int count=1;
	  while(count<left){
	      prev=newHead;
	      newHead=newHead.next;
	      count++;
	  }
	  // Reach to right node 
	  ListNode newTail=newHead;
	  while(count<right){
	      newTail=newTail.next;
	      count++;
	  }
	  ListNode tailNext=newTail.next;
	  newTail.next=null;
	  ListNode temp=reverse(newHead);
	  
	  if(prev!=null)
	      prev.next=temp;
	  
	  ListNode curr=temp;
	  while(curr.next!=null){
	      curr=curr.next;
	  }
	  curr.next=tailNext;
	  
	  if(left==1)
	      return temp;
	  
	  return head;
	  
	}
	public ListNode reverse(ListNode head){
	   if(head==null || head.next==null)
	        return head;
	    
	    ListNode pre=null;
	    ListNode curr=head;
	    ListNode next=null;
	    
	    while(curr!=null){
	        next=curr.next;
	        curr.next=pre;
	        pre=curr;
	        curr=next;
	    }
	    return pre;
	}
}
