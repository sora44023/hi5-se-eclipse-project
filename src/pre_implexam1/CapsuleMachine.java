package pre_implexam1;

public class CapsuleMachine {
	private int leftCap;	// 残りのカプセル数
	private static final char CAPSULE_CHAR = '0';	// カプセル数を表す文字
	
	public CapsuleMachine(int leftCap) {
		this.leftCap = leftCap;
	}
	void show() {
		System.out.print("Left capsules:  ");
		if(leftCap == 0)
			System.out.println("sold out.");
		else {
			for(int i=0;i<leftCap;i++)
				System.out.print(CAPSULE_CHAR);
			System.out.println();
		}
	}
	boolean buy(String name) {
		if(leftCap<=0)
			return false;
		System.out.println("===== Start: " + name + " =====");
		System.out.println(name + "is getting a capsule.. ");
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Done!");
		leftCap--;
		show();
		System.out.println("===== End:   " + name + " =====");
		return true;
	}
}
