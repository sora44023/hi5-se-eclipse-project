package kadai2_ex;

public class RunnableCounter implements Runnable {
	String name;
	
	RunnableCounter(String name){
		this.name = name;
	}
	@Override
	public void run(){
		for(int i=1; i<=5; i++)
			System.out.println(name + ": " + i);
	}
}
