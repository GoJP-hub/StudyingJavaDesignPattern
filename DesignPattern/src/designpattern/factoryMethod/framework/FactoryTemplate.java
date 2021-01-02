package designpattern.factoryMethod.framework;

public abstract class FactoryTemplate {
	/****************************************
	 * Description--Template methods to implement at child class
	 * <p>open()/print()/close()</p>
	 * @author gohir
	 *****************************************/
	public abstract ProductTemplate createProduct(String owner);

	public abstract void registerProduct(ProductTemplate product);

	/****************************************
	 * Description--Base methods for creating a product
	 * @author gohir
	 *****************************************/
	public final ProductTemplate createOfficially(String owner) {
		ProductTemplate p = createProduct(owner);
		registerProduct(p);
		return p;
	}
}
