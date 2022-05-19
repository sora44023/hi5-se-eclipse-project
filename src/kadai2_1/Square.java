package kadai2_1;

public class Square {
	private char character;
	private int size;
	
	Square(char character, int size){
		this.character = character;
		this.size = size;
	}
	void draw() {
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print(character);
			}
			System.out.println();
		}
	}
}
