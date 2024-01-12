package myLinkedList;

public class Insertion {
Node head;
 public void insertAtFront(int newData) {
	 Node newNode=new Node();
	 newNode.data=newData;
	 newNode.next=head;
	 head=newNode;
 }
 
 void Print() {
	 Node node=head;
	 while(node!=null) {
		 System.out.println(node.data+" ");
		 node=node.next;
	 }
	 System.out.println();
 }
 
 public static void main(String[] args) {
	Insertion list =new Insertion();
	list.insertAtFront(2);
	list.insertAtFront(22);
	list.insertAtFront(23);
	list.insertAtFront(233);
	list.insertAtFront(25);
	
	System.out.println("after insertion _______________");
	
	list.Print();
}
}
