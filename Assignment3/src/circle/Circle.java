package circle;

public class Circle {
	private double radius,area;
	
	Circle(double rad){
		this.radius=rad;
		System.out.println("Circle of radius "+this.radius+" is created");}
	
	private void calculateArea() {
		this.area=3.14*radius*radius;
	}
	public double getArea() {
		calculateArea();
		return this.area;
	}
	
	

}
