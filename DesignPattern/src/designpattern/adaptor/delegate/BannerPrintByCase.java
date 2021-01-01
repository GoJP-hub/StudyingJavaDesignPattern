package designpattern.adaptor.delegate;

public class BannerPrintByCase extends PrintByCase {
	private Banner banner;
	public BannerPrintByCase(String contents) {
		this.banner = new Banner(contents);
	}
	/****************************************
	 * Description--Naming convention has been standardized to Interface: showWithParen
	 * @author gohir
	 *****************************************/
	public void printWeak() {
		banner.showWithParen();
	}
	/****************************************
	 * Description--Naming convention has been standardized to Interface: showWithAster
	 * @author gohir
	 *****************************************/
	public void printStrong() {
		banner.showWithAster();
	}
}
