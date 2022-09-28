package kadai5_1;

public class Line extends Figure{
	private int len;
	
	Line(char c, int len){
		super(c);
		this.len = len;
	}

	@Override
	public void draw() {
		for(int i=0; i<len; i++) {
			System.out.print(getCharacter());
		}
		System.out.println();
		
	}

	@Override
	public String toString() {
		return "Line(" + getCharacter() + ", " + String.valueOf(len) + ")";
	}
}
