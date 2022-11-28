package implexam3_2021;

public class TextBuilder extends Builder {

	@Override
	void printTitle(String title) {
		for (int i = 0; i < title.length(); i++)
			System.out.print("=");
		System.out.println("\n" + title);
		for (int i = 0; i < title.length(); i++)
			System.out.print("=");
		System.out.println();

	}

	@Override
	void printHeading(String text) {
		System.out.println("<< " + text + " >>");
	}

	@Override
	void printItems(String[] items) {
		for(int i=0; i<items.length; i++)
			System.out.println("    " + items[i]);

	}

	@Override
	void printText(String text) {
		System.out.println(text);
	}

}
