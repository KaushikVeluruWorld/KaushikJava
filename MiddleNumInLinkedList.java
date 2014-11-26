
public class MiddleNumInLinkedList {

	Node first;
	Node second;
	
	public int findMid(Node head)
	{
		first=head;
		second=head;
		
		while(second.next.next!=null)
		{
			second=second.next;
			second=second.next;
			first=first.next;
		}

		return first.data;
	}
	
	
	public static void main(String args[])
	{
		
		MiddleNumInLinkedList m=new MiddleNumInLinkedList();
		
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.addAtFront(1);
		sl.addAtFront(2);
		sl.addAtFront(3);
		sl.addAtFront(4);
		sl.addAtFront(5);
		sl.printList();
		
		int result=m.findMid(sl.head);
		System.out.println("mid: "+result);
		
	}
}
