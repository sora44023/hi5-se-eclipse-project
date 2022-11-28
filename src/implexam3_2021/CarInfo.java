package implexam3_2021;

public class CarInfo {
	private String name;
	private String maker;
	private String style;
	private int year;
	private String comment = "";

	CarInfo(String name, String maker, String style, int year) {
		this.name = name;
		this.maker = maker;
		this.style = style;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public String getMaker() {
		return maker;
	}

	public String getStyle() {
		return style;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return "" + maker + "" + name + " " + "(" + style + ", " + year + ")";
	}
}
