package designpattern.prototype;

import designpattern.prototype.concreteProto.MessageBox;
import designpattern.prototype.concreteProto.UnderlinePen;
import designpattern.prototype.framework.Manager;
import designpattern.prototype.framework.ProductProto;

public class MainProto {
	public static void main(String[] args) {
		/****************************************
		 * Description--Create an instance for Client (Class that creates and use prototypes)
		 * @author gohir
		 *****************************************/
		Manager manager = new Manager();

		/****************************************
		 * Description--Create instances for prototype
		 * @author gohir
		 *****************************************/
		UnderlinePen upen = new UnderlinePen('-');
		MessageBox mbox1 = new MessageBox('*');
		MessageBox mbox2 = new MessageBox('/');

		/****************************************
		 * Description--Register proto into lists as interface Prototype
		 * @author gohir
		 *****************************************/
		manager.register("underline message", upen);
		manager.register("warning box", mbox1);
		manager.register("slash box", mbox2);

		/****************************************
		 * Description--Create and use the registered prototypes
		 * @author gohir
		 *****************************************/
		ProductProto p1 = manager.create("underline message");
		p1.use("Hello World");
		ProductProto p2 = manager.create("warning box");
		p2.use("Hello World");
		ProductProto p3 = manager.create("slash box");
		p3.use("Hello World");
	}
}
