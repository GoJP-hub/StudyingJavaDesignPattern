package designpattern.factoryMethod.cardId;

import designpattern.factoryMethod.framework.ProductTemplate;

public class CardId extends ProductTemplate{
	/****************************************
	 * Description--インスタンス作成時に、Ownerを設定する
	 * @author gohir
	 *****************************************/
	private String owner;
	public CardId(String owner) {
		// TODO 自動生成されたコンストラクター・スタブ
		System.out.println("Create an Id Card for " + owner);
		this.owner = owner;
	}

	/****************************************
	 * Description--Template method
	 * @author gohir
	 *****************************************/
	@Override
	public void use() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Use the ID card for " + owner);
	}

	/****************************************
	 * Description--Getter for the variable owner
	 * @author gohir
	 *****************************************/
	public String getOwner() {
		return owner;
	}

}
