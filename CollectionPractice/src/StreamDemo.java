import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(4,5,7,8,2,9);
		int sum=0;
//		Stream<Integer> s=nums.stream();
//		Stream<Integer> s1=s.filter(n ->n%2==0);
//		Stream<Integer> s2=s1.map(n ->n*n);
//		int result= s2.reduce(0, (c,e)->c+e);
		
		int result=nums.stream().filter(n ->n%2==0)
		.map(n->n*n).reduce(0,(c,e) ->c+e);
		
		System.out.println(result);
//		s2.forEach(n ->System.out.println(n));
		
		
		System.out.println(nums);
		System.out.println(sum);

	}

}
