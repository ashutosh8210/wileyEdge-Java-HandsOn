package circle;

import java.util.Scanner;

public class DrawCircle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter radius of Circle");
		double radius=scan.nextDouble();
		Circle c1=new Circle(radius);
		double area=c1.getArea();
		System.out.println("Area of Circle :"+area);
		scan.close();

	}

}
