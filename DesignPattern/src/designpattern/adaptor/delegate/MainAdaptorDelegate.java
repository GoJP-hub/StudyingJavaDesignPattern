package designpattern.adaptor.delegate;

public class MainAdaptorDelegate {
	public static void main(String[] args) {
		PrintByCase p = new BannerPrintByCase("Hello2");
		p.printStrong();
		p.printWeak();
	}
}
