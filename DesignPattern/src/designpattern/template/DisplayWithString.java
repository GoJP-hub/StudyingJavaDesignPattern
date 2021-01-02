package designpattern.template;

public class DisplayWithString extends Display {
	private String contents;
	private int width;

	/****************************************
	 * Description--Create instance with contents
	 * @author gohir
	 *****************************************/
	public DisplayWithString(String contents) {
		this.contents = contents;
		this.width = contents.getBytes().length;
	}

	/****************************************
	 * Description--Display format for this String class
	 * @author gohir
	 *****************************************/
	public void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

	/****************************************
	 * Description--Template Item
	 * @author gohir
	 *****************************************/
	@Override
	public void open() {
		// TODO 自動生成されたメソッド・スタブ
		printLine();
	}

	@Override
	public void print() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("|" + contents + "|");
	}

	@Override
	public void close() {
		// TODO 自動生成されたメソッド・スタブ
		printLine();
	}

}
