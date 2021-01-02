package designpattern.factoryMethod.cardId;

import java.awt.List;

import designpattern.factoryMethod.framework.FactoryTemplate;
import designpattern.factoryMethod.framework.ProductTemplate;

public class FactoryCardId extends FactoryTemplate {
	private List owners = new List();

	/****************************************
	 * Description--Template methods for creating product by each owner
	 * @author gohir
	 *****************************************/
	@Override
	public ProductTemplate createProduct(String owner) {
		// TODO 自動生成されたメソッド・スタブ
		return new CardId(owner);
	}

	@Override
	public void registerProduct(ProductTemplate product) {
		// TODO 自動生成されたメソッド・スタブ
		owners.add(((CardId) product).getOwner());
	}
	/****************************************
	 * Description--getter methods for group of owners
	 * @author gohir
	 *****************************************/
	public List getOwners() {
		return owners;
	}

}
