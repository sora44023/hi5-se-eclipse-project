package implexam3_2021;

public class MarkdownBuilder extends Builder {

	@Override
	void printTitle(String title) {
		System.out.println("# " + title);
	}

	@Override
	void printHeading(String text) {
		System.out.println("\n## " + text);
	}

	@Override
	void printItems(String[] items) {
		System.out.println();
		for(int i=0; i<items.length; i++)
			System.out.println("- " + items[i]);

	}

	@Override
	void printText(String text) {
		System.out.println("\n" + text);
	}

}
