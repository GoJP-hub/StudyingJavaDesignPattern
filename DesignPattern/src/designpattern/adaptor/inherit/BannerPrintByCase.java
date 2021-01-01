package designpattern.adaptor.inherit;

public class BannerPrintByCase extends Banner implements PrintByCase {
	public BannerPrintByCase(String contents) {
		super(contents);
	}

	/****************************************
	 * Description--Naming convention has been standardized to Interface: showWithParen
	 * @author gohir
	 *****************************************/
	public void printWeak() {
		showWithParen();
	}
	/****************************************
	 * Description--Naming convention has been standardized to Interface: showWithAster
	 * @author gohir
	 *****************************************/
	public void printStrong() {
		showWithAster();
	}

}
