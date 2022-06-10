package exam_s1;

public class PersonTest {
	public static void main(String[] args) {
		Notebook nb = new Notebook();
		for (int i = 0; i < 30; i++) {
			PersonThread u1 = new PersonThread(nb);
			System.out.print(u1);
			if ((i + 1) % 10 == 0) // 見やすさのために10個ずつ改行する
				System.out.println();
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
