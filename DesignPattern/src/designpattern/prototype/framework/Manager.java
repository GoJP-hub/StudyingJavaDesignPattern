package designpattern.prototype.framework;

import java.util.HashMap;

public class Manager {
	/****************************************
	 * Description--Create a list for stocking the product
	 * @author gohir
	 *****************************************/
	private HashMap showcase = new HashMap();

	/****************************************
	 * Description--Store proto into showcase
	 * @author gohir
	 *****************************************/
	public void register(String name, ProductProto proto) {
		// TODO 自動生成されたメソッド・スタブ
		showcase.put(name, proto);
	}

	/****************************************
	 * Description--Get the proto from "showcase" and create clone
	 * @author gohir
	 *****************************************/
	public ProductProto create(String name) {
		ProductProto p = (ProductProto)showcase.get(name);
		return p.createClone();
	}
}
