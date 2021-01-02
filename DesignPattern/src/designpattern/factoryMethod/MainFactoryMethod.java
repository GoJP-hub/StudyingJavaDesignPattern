package designpattern.factoryMethod;

import designpattern.factoryMethod.cardId.FactoryCardId;
import designpattern.factoryMethod.framework.FactoryTemplate;
import designpattern.factoryMethod.framework.ProductTemplate;

public class MainFactoryMethod {
	public static void main(String[] args) {
		/****************************************
		 * Description--Create instance for specified factory
		 * @author gohir
		 *****************************************/
		FactoryTemplate factory = new FactoryCardId();

		/****************************************
		 * Description--Create a product using the factory
		 * @author gohir
		 * @param String owner
		 *****************************************/
		ProductTemplate p1 = factory.createOfficially("田中　雄太");
		ProductTemplate p2 = factory.createOfficially("鈴木　真紀");
		ProductTemplate p3 = factory.createOfficially("中田　アイザック");

		/****************************************
		 * Description--Use the product defined at Product interface
		 * @author gohir
		 *****************************************/
		p1.use();
		p2.use();
		p3.use();
	}
}
