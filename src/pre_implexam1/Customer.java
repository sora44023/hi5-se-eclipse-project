package pre_implexam1;

public class Customer {
	private String name;
	private CapsuleMachine cm;
	
	Customer(String name, CapsuleMachine cm){
		this.name = name;
		this.cm = cm;
	}
	
	String getName() {
		return name;
	}
	
	boolean doShopping() {
		return cm.buy(name);
	}
}
