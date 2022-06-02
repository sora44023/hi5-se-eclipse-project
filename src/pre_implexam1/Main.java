package pre_implexam1;

public class Main {
	public static void main(String[] args) {
		CapsuleMachine cm = new CapsuleMachine(5);
		cm.show();
		Customer c1 = new Customer("Thomas", cm);
		c1.doShopping();
		c1.doShopping();
	}
}
