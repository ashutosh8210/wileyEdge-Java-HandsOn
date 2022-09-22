package fibonacci;

public class FibonacciBusiness {
	private int range;
	public FibonacciBusiness(int num) {
		this.range=num;
	}
	public void printFibonacci() {
		int first=0,second=1;
		int third=0;
		System.out.print(first+",");
		System.out.print(second+",");
		while((first+second)<=range){
			 third=first+second;
			System.out.print(third+",");
			first=second;
			second=third;
		}
	}
	
	

}
