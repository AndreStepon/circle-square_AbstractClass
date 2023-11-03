
public class Square extends Command{

	public float length;
	
	public Square(float length) {
		this.length = length;
	}
	@Override
	public float calcSquare() {
		return length*length;
		
	}

	@Override
	public float calcPerimeter() {
		return 4*length;
		
	}

}
