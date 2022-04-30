package kadai1_1;

public class PlacedRectangle extends Rectangle{
	int x;
	int y;
	int width;
	int height;
	
	PlacedRectangle(){
		super();
		setLocation(0,0);
	}
	
	PlacedRectangle(int x, int y){
		setLocation(x,y);
	}
	
	PlacedRectangle(int x, int y, int width, int height){
		super(width,height);
		setLocation(x,y);
	}
	
	void setLocation(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString(){
		return "[ " + "(" + x + ", " + y + ") "+ super.toString() + "]";
	}
}
