
public class SinglyLinkedList {

	Node head=new Node();
	public SinglyLinkedList() {
	 
	}
	
	private void deleteAtFront()
	{
		if(head==null)
		{
			System.out.println("list is empty!!");
		}
		else
		{
			
			head=head.next;

		}
	}
	public void addAtFront(int d)
	{
		
		if(head==null)
		{
			Node temp=new Node();
			temp.data=d;
			temp.next=null;
			head=temp;
			
		}
		else
		{
			Node temp=new Node();
			temp.data=d;
			temp.next=head;			
			head=temp;
			
		}
	}
	public void printList()
	{
		if(head.next==null)
		{
			System.out.println("list is empty");
		}
		Node temp=head;
		
		while(temp.next!=null)
		{
			System.out.print(temp.data + "  ");
			temp=temp.next;
		}
	}
	
	public int dataAtIndex(int pos)
	{
		Node temp=head;
		
		while(pos > 1)
		{
			temp=temp.next;
			pos--;
		}
		
		return temp.data;
	}
	
	public static void main(String args[])
	{
		SinglyLinkedList sl=new SinglyLinkedList();
		
		
		sl.addAtFront(1);	
		sl.addAtFront(2);
		sl.addAtFront(3);	
		sl.addAtFront(4);
		sl.printList();
		System.out.println();
		sl.deleteAtFront();
		System.out.println("after deleating at front");
		sl.printList();
		System.out.println("\nafter adding at last");
		sl.printList();
		//sl.printList();
		System.out.println("\n data at index 1: "+sl.dataAtIndex(1));
	}
}
