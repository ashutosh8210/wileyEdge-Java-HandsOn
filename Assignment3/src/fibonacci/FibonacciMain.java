package fibonacci;

import java.util.Scanner;

public class FibonacciMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter range upto which you want fibonacci series");
		int range=scan.nextInt();
		FibonacciBusiness fib=new FibonacciBusiness(range);
		fib.printFibonacci();
		scan.close();
	}

}
