public class Rectangle {
	/*
	 * Design a class named Rectangle to represent a rectangle. It should contains
	 *  - Two double data fields named width and height. The default values for both is 1.
	 *  - A no-arg constructor that creates a default rectangle
	 *  - A constructor that creates a rectangle with the specified width and height
	 *  - Getter methods for the width and height
	 *  - A method named getArea() that returns the are of this rectangle A = l*w
	 *  - A method named getPerimeter() that returns the perimeter of this rectangle P = 2 * (l+w)
	 */
	double width = 1;
	double height = 1;

	Rectangle(){
		width = 1;
		height = 1;
	}

	Rectangle(double inputHeight,double inputWidth){
		width = inputWidth;
		height = inputHeight;
	}

	public double getWidth(){
		return(width);
	}
	public double getHeight(){
		return(height);
	}
	public double getArea(){
		return(width*height);
	}
	public double getPerimeter(){
		return (2*(width+height));
	}
}
