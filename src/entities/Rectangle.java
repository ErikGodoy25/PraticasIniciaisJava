package entities;

public class Rectangle {
	
	public double width;
	public double heigth;

	public double area() {

		return width * heigth;
	}

	public double parimeter() {

		return 2 * (width + heigth);
	}

	public double diagonal() {

		return Math.sqrt(width * heigth + width * heigth);
	}	
				
}
