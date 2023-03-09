import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		
		list.add("abc");
		list.addFirst("123");
		list.addLast("def");
		
		System.out.println(list);
		list.add(1, "@###@");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.remove();
		System.out.println(list);

	}

}
