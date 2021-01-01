package designpattern.adaptor.delegate;

public class Banner {
	private String contents;

	public Banner(String contents) {
		this.contents = contents;
	}
	/****************************************
	 * Description--Create a banner: with parenthesis
	 * @author gohir
	*****************************************/
	public void showWithParen() {
		System.out.println("(" + contents + ")");
	}

	/****************************************
	 * Description--Create a banner: with aster
	 * @author gohir
	 *****************************************/
	public void showWithAster() {
		System.out.println("*" + contents + "*");
	}
}
