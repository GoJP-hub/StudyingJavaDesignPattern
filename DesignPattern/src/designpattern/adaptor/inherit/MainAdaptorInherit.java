package designpattern.adaptor.inherit;

public class MainAdaptorInherit {
	public static void main(String[] args) {
		/****************************************
		 * Description--Creating an instance by API (interface) but with contents of concrete item
		 * @author gohir
		 *****************************************/
		PrintByCase p = new BannerPrintByCase("Hello");

		/****************************************
		 * Description--Action methods for creating a banner
		 * @author gohir
		 *****************************************/
		p.printStrong();
		p.printWeak();
	}
}
