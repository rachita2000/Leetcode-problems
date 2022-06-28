package solved;

import java.util.HashMap;

public class CopyListWithRandomPointer {

	class Node {
	    int val;
	    Node next;
	    Node random;

	    public Node(int val) {
	        this.val = val;
	        this.next = null;
	        this.random = null;
	    }
	} 
	public Node copyRandomList(Node head) {
        HashMap<Node,Node>map=new HashMap<>();
        Node temp=head;
        //create new copy of node and store them with old nodes in Map  
        while(temp!=null){
            Node node=new Node(temp.val);
            map.put(temp,node);
            temp=temp.next;
        }
        
        
        for(Node n:map.keySet()){
            //new Node
            Node nn=map.get(n);
            
            //old node next
            Node next=n.next;
            
            //set new node next to old node new copy 
            nn.next=map.get(next);
            
             //old node random
            Node rand=n.random;
            
            //set new node random to old node new copy 
            nn.random=map.get(rand);
        }
        return map.get(head);
    }
}
