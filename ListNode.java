package solved;

public class ListNode {
	 int val;
	 ListNode next;
	 ListNode() {}
	 ListNode(int val) { this.val = val; }
	 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 
	 public static void print(ListNode head)
	 {
		 if(head==null)
			 System.out.println(-1);
		 ListNode cur=head;
		 while(cur!=null)
		 {
			 System.out.println(cur.val);
			 cur=cur.next;
		 }
		 
	 }
	 public static void main(String[] args) {
		
	}
}
