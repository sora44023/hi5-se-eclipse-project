package kadai2_ex;

public class Counter {
	String name;
	
	Counter(String name) {
		this.name = name;
	}
	
	public void count() {
		for(int i=1; i<=5; i++)
			System.out.println(name + ": " + i);
	}
}
