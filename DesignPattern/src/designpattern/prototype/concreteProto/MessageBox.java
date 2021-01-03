package designpattern.prototype.concreteProto;

import designpattern.prototype.framework.ProductProto;

public class MessageBox implements ProductProto {
	private char decochar;

	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	/****************************************
	 * Description--Create a message box with given message
	 * @author gohir
	 *****************************************/
	@Override
	public void use(String s) {
		// TODO 自動生成されたメソッド・スタブ
		int length = s.getBytes().length;
		/****************************************
		 * Description--create line
		 * @author gohir
		 *****************************************/
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");

		/****************************************
		 * Description--Main message
		 * @author gohir
		 *****************************************/
		System.out.println(decochar + " " + s + " " + decochar);

		/****************************************
		 * Description--create line
		 * @author gohir
		 *****************************************/
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
	}

	/****************************************
	 * Description--Create a clone of this class's instance
	 * @author gohir
	 *****************************************/
	@Override
	public ProductProto createClone() {
		// TODO 自動生成されたメソッド・スタブ
		ProductProto p = null;
		try {
			p = (ProductProto)clone();
		}catch (CloneNotSupportedException e){
			e.printStackTrace();
		}
		return p;
	}

}
