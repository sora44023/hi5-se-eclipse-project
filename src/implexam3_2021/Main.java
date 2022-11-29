package implexam3_2021;

public class Main {

	public static void main(String[] args) {
		System.out.println("@@ TextBuilder @@");
		Builder builder = new TextBuilder();

		CarInfo ci1 = new CarInfo("Insight", "Honda", "compact", 2010);
		ci1.setComment("This is a nice car!");
		CarInfoPrinter cip1 = new CarInfoPrinter(builder, ci1);
		cip1.print();

		System.out.println();

		CarInfo ci2 = new CarInfo("A3", "Audi", "sedan", 2021);
		CarInfoPrinter cip2 = new CarInfoPrinter(builder, ci2);
		cip2.print();

		System.out.println("\n@@ MarkdownBuilder @@");
		builder = new MarkdownBuilder();

		cip1 = new CarInfoPrinter(builder, ci1);
		cip1.print();

		System.out.println();

		cip2 = new CarInfoPrinter(builder, ci2);
		cip2.print();
	}

}
