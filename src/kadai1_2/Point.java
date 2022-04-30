package kadai1_2;

public class Point {

	private int x;
	private int y;
	private int num;
	static int counter = 1;

	Point(int x, int y){
		this.x = x;
		this.y = y;
		num = counter;
		counter++;
	}

	@Override
	public String toString(){
		return "[" +  num + "] (" + x + "," + y + ")";
	}

}
