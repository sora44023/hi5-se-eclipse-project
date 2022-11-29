package implexam3_2021;

public class CarInfoPrinter {
	private Builder builder;
	private CarInfo ci;

	public CarInfoPrinter(Builder builder, CarInfo ci) {
		this.builder = builder;
		this.ci = ci;
	}

	public void print() {
		builder.printTitle(ci.getName());
		builder.printHeading("Data");
		builder.printItems(
				new String[] { "maker: " + ci.getMaker(), "style: " + ci.getStyle(), "year : " + ci.getYear() });
		builder.printHeading("Comment");
		builder.printText(ci.getComment());
	}
}
