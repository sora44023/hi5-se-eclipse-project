package implexam3_2021;

public class BuilderTest {
	public static void main(String[] args) {
		Builder b = new TextBuilder();
		b.printTitle("title test");
		b.printText("Hello!");
		b.printHeading("my hobby");
		b.printItems(new String[] {"piano", "baseball"});
		b.printText("Bye.");
	}
}
