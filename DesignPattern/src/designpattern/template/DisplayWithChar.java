package designpattern.template;

public class DisplayWithChar extends Display{

	private char contents;

	/****************************************
	 * Description--Create instance with contents
	 * @author gohir
	 *****************************************/
	public DisplayWithChar(char contents) {
		this.contents = contents;
	}

	/****************************************
	 * Description--Template item
	 * @author gohir
	 *****************************************/
	@Override
	public void open() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("<<");
	}

	@Override
	public void print() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print(contents);
	}

	@Override
	public void close() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(">>");
	}

}
