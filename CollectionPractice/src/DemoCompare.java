import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoCompare {

	public static void main(String[] args) {
		Comparator<Integer> com=new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1%10>o2%10) {
					return 1;
				}else if(o1%10<o2%10) {
					return -1;
				}else
					return 0;
			}
		};
		
		List<Integer> list=new ArrayList<>();
		
		list.add(42);
		list.add(31);
		list.add(86);
		list.add(23);
		
		Collections.sort(list,com);
		System.out.println(list);

	}

}
