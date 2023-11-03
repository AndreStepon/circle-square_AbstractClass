
public class Programa {

	public static void main(String[] args) {
		Command circle = new Circle(5, 3.1415f);
		Command square = new Square(3);
		
		System.out.println(circle.calcPerimeter());
		System.out.println(circle.calcSquare());
		
		
		System.out.println(square.calcPerimeter());
		System.out.println(square.calcSquare());
	}

}
