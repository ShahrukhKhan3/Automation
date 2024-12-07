package SHap;


public class Shapes {
	int width;
	int height;
class Circle extends Shapes{
	int width;
	int height;
	void area(int width) {
		this.width=width;
		
	}
void area(int width,int height) {
		this.width=width;
		this.height=height;
	}
	void display() {
		System.out.println("Width of CIrcle is "+width);
		System.out.println("Area of Circle is " +width*height);
	}
	
} 

class Rectangle extends Shapes{
	
}
	public static void main(String[] args) {
		Shapes shapes = new Shapes();
        Circle obj = shapes.new Circle();
        obj.area(10);
        obj.area(10, 200);
        obj.display();
	}

}
