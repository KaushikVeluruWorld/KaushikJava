


public class FindIntersectPointInLinkedList {

	Node head;
	Node head1;
	Node head2;
	
	public void intersectingPoint(Node head,  Node head2)
	{
		Node temp=head;
		
		
		while(temp.next!=null)
		{
			Node temp2=head2;
			while(temp2.next!=null)
			{
				if(temp2==temp)
				{
					System.out.println("\nintersecting at :"+temp.data);
					return;
				}
				else
				{
					temp2=temp2.next;
				}
			}
			temp=temp.next;
		}
		
	}
	
	public static void main(String args[])
	{
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.addAtFront(7);
		sl.addAtFront(6);
		sl.addAtFront(3);
		sl.addAtFront(2);
		sl.addAtFront(1);
		
		
		SinglyLinkedList sl3 = new SinglyLinkedList();
		sl3.addAtFront(5);
		sl3.addAtFront(4);
				
		Node temp=sl3.head;
		temp=temp.next;
				
		Node temp1=sl.head;
		temp1 = temp1.next;
		temp1 = temp1.next;
		temp1 = temp1.next;
		temp.next=temp1;
	

		sl.printList();
		System.out.println();
		sl3.printList();
		
		FindIntersectPointInLinkedList f=new FindIntersectPointInLinkedList();
		f.intersectingPoint(sl.head, sl3.head);
		
	}
}
