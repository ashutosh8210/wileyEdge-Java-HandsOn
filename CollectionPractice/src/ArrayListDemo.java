import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arrList=new ArrayList<Integer>();
		
		arrList.add(0);
		arrList.add(1);
		arrList.add(5);
		arrList.add(29);
		
		System.out.println(arrList);
		
		arrList.add(1,24);
		System.out.println(arrList);
		
		arrList.set(0, 12);
		System.out.println(arrList);
		
		arrList.remove(1);
		System.out.println(arrList);
		
		Collections.sort(arrList);
		
		System.out.println(arrList);
	}

}
