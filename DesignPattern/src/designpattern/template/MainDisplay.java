package designpattern.template;

public class MainDisplay {
	public static void main(String[] args) {
		/****************************************
		 * Description--Create instance for display: ①for char ②for string
		 * @author gohir
		 *****************************************/
		Display d1 = new DisplayWithChar('H');
		Display d2 = new DisplayWithString("Hello World");
		Display d3 = new DisplayWithString("こんにちは");

		/****************************************
		 * Description--Use a display method
		 * @author gohir
		 *****************************************/
		d1.display();
		d2.display();
		d3.display();
	}
}
