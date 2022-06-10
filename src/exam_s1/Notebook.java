package exam_s1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Notebook {
	private static int n = 1;

	synchronized void write(String name, int speed, String message) {
		System.out.println(name + ": session No. " + n++);
		System.out.print(name + ": ");
		for (int i = 0; i < message.length(); i++) {
			System.out.print(message.charAt(i));
			try {
				Thread.sleep(300 / speed);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		LocalDateTime now = LocalDateTime.now(); // 現在時刻を取得
		String date = DateTimeFormatter.ofPattern("HH:mm:ss.SSSSSS").format(now); // 表示する形式を指定
		System.out.println("\n" + name + ": ended at " + date);
		System.out.println("----------");
	}
}
