
public class LinkedListDemo {
	Node head;
	private int size;
	LinkedListDemo(){
		size=0;
	}
	
		class Node{
			String data;
			Node next;
			
			Node(String data){
				this.data=data;
				this.next=null;
				size++;
			}
		}
		
		public void addFirst(String data) {
			Node newNode=new Node(data);
			if(head==null) {
				head=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;
			
		}
		public void addLast(String data) {
			Node newNode=new Node(data);
			if(head==null) {
				head=newNode;
				return;
			}
			Node currentNode=head;
			while(currentNode.next!=null) {
				currentNode=currentNode.next;
			}
			currentNode.next=newNode;
		}
		
		public void printList() {
			if(head==null) {
				System.out.println("List is empty");
				return;
			}
			Node currentNode=head;
			while(currentNode!=null) {
				System.out.println(currentNode.data+",");
				currentNode=currentNode.next;
			}
		}
		
		public void deleteFirst() {
			if(head==null) {
				System.out.println("List is empty...");
			}
			head=this.head.next;
			size--;
		}
		
		public void deleteLast() {
			if(head==null) {
				System.out.println("List is empty...");
			}
			size--;
			if(head.next==null) {
				head=null;
			}
			
			Node lastNode=head.next;
			Node currentNode=head;
			while(lastNode!=null) {
				currentNode=currentNode.next;
				lastNode=lastNode.next;
			}
			currentNode.next=null;
		}

	public static void main(String[] args) {
		LinkedListDemo list=new LinkedListDemo();
		list.addFirst("a");
		list.addFirst("is");
		list.addLast("Good");
		list.addLast("Boy");
		list.addFirst("Tommy");
		list.printList();
		
		list.deleteFirst();
		list.deleteLast();
		System.out.println("After deleting first and last....");
		list.printList();
		
		

	}

}
