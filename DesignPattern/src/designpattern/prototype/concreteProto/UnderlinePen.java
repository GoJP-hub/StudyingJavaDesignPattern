package designpattern.prototype.concreteProto;

import designpattern.prototype.framework.ProductProto;

public class UnderlinePen implements ProductProto{
	private char ulchar;
	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}

	@Override
	public void use(String s) {
		// TODO 自動生成されたメソッド・スタブ
		int length = s.getBytes().length;
		/****************************************
		 * Description--Print the main message
		 * @author gohir
		 *****************************************/
		System.out.println("\"" + s + "\"");

		/****************************************
		 * Description--Print the underline
		 * @author gohir
		 *****************************************/
		System.out.print(" ");
		for (int i = 0; i < length; i++) {
			System.out.print(ulchar);
		}
		System.out.println(" ");
	}

	@Override
	public ProductProto createClone() {
		ProductProto p = null;
		try {
			p = (ProductProto)clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
