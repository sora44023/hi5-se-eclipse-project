package kadai5_1;

public class Square extends Figure{
	private int size;
	
	Square(char c, int size){
		super(c);
		this.size = size;
	}

	@Override
	public void draw() {
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print(getCharacter());
			}
			System.out.println();
		}
		
	}

	@Override
	public String toString() {
		return "Square(" + getCharacter() + ", " + String.valueOf(size) + ")";
	}
}
