
public class ReverseLinkedList extends SinglyLinkedList{

	public Node reverseList(Node original)
	{
		Node newlist=new Node();
		
		newlist.data=original.data;
		newlist.next=null;
		original=original.next;
		
		
		
		while(original.next!=null)
		{
			Node temp=new Node();
				temp.data=original.data;
				temp.next=newlist;
				newlist=temp;
				original=original.next;
				
		}

		return newlist;
	}
	
	public static void main(String args[]) 
	{
		ReverseLinkedList r=new ReverseLinkedList();
		r.addAtFront(1);
		r.addAtFront(2);
		r.addAtFront(3);
		r.addAtFront(4);
		r.addAtFront(5);

		System.out.println("initial linked list:");
		r.printList();

		Node newlist=r.reverseList(r.head);
		System.out.println("\nafter reversing:");
	
		while(newlist!=null)
		{
			System.out.print(newlist.data + "  ");
			newlist=newlist.next;
		}
				
		System.exit(0);
		
	}
}
