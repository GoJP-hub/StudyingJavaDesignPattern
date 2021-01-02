package designpattern.singleton;

public class MainSingleton {
	public static void main(String[] args) {
		System.out.println("Start");
		/****************************************
		 * Description--Create instances
		 * @author gohir
		 *****************************************/
		SingletonPattern obj1 = SingletonPattern.getInstance();
		SingletonPattern obj2 = SingletonPattern.getInstance();

		/****************************************
		 * Description--Assert whether these instances are same
		 * @author gohir
		 *****************************************/
		if(obj1 == obj2) {
			System.out.println("they are same instances");
		}else {
			System.out.println("they are NOT same instance");
		}

		System.out.println("end");

	}
}
