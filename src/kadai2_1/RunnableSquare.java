package kadai2_1;

public class RunnableSquare implements Runnable {
	private char character;
	private int size;
	
	RunnableSquare(char character, int size){
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
	
	@Override
	public void run(){
		draw();
	}
}
