package exam_s1;

public class Main {
	public static void main(String[] args) {
		Notebook nb = new Notebook();
		for (int i = 0; i < 4; i++) {
			PersonThread p = new PersonThread(nb);
			Thread t = new Thread(p);
			t.start();
		}
	}
}
