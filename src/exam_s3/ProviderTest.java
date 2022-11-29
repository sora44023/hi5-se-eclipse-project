package exam_s3;

public class ProviderTest {
	public static void main(String[] args) {
		DigitProvider dp = new DigitProvider();
		for (int i = 0; i < 10; i++) 
			System.out.print("[" + dp.getNext() + "]");
		System.out.println();		
	}
}