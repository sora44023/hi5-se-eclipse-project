package exam_s1;

import java.util.*;

public class PersonThread implements Runnable {
	private String name;
	private static char tname = 'A';
	private int speed;
	private Notebook nb;

	PersonThread(Notebook nb) {
		this.nb = nb;
		Random r2 = new Random();
		speed = r2.nextInt(5) + 1;
		name = String.valueOf(tname);
		tname++;
		if (tname > 'Z')
			tname = 'A';
	}

	@Override
	public void run() {
		String[] msglist = new String[] { "Hello.", "Hi!", "How are you?" };
		Random r = new Random();
		nb.write(name, speed, msglist[r.nextInt(msglist.length)]);
	}

	@Override
	public String toString() {
		return name + "(" + speed + ")";
	}
}
