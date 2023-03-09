import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Students implements Comparable<Students> {
	String name;
	int rollno;
	

	public Students(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}


	@Override
	public String toString() {
		return "Students [name=" + name + ", rollno=" + rollno + "]";
	}
	@Override
	public int compareTo(Students o) {
		if(this.rollno>o.rollno) {
			return 1;
		}else return -1;
	}


	public static void main(String[] args) {
		List<Students> list=new ArrayList<>();
		
		list.add(new Students("Ashutosh",21));
		list.add(new Students("Rahul",32));
		list.add(new Students("Vivek",18));
		list.add(new Students("Onkar",44));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		

	}


	

}
