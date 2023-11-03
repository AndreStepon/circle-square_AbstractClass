
public class Circle extends Command {

	final static float CONSTANT_PI = 3.1415f;
	public float radius;
	
	public Circle(float radius, float CONSTANT_PI) {
		this.radius = radius;
	}
	
	@Override
	public float calcSquare() {
		return  CONSTANT_PI * (radius * radius);				
	}

	@Override
	public float calcPerimeter() {
		return 2 * CONSTANT_PI * radius;
				
	}
}
