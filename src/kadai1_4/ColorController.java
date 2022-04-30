package kadai1_4;

public class ColorController {

	static private boolean sb;
	static private int first_digit;
	static private int second_digit;

	public enum Color {
		RED, YELLOW, BLUE, WHITE
	}

	static void setColor(Color col, boolean setbg) {
		sb = setbg;
		if (sb)
			second_digit = 4;
		else
			second_digit = 3;
		switch (col) {
		case RED:
			first_digit = 1;
			break;
		case YELLOW:
			first_digit = 3;
			break;
		case BLUE:
			first_digit = 4;
			break;
		case WHITE:
			first_digit = 7;
			break;
		}
		System.out.print("\u001B[" + second_digit + first_digit + "m");
	}

	static void setColor(Color col) {
		setColor(col, false);
	}

	static void reset() {
		System.out.print("\u001B[0m");
	}
}