package designpattern.singleton;

public class SingletonPattern {
	/****************************************
	 * Description--Create the instance as default & by private
	 * @author gohir
	 *****************************************/
	private static SingletonPattern sing = new SingletonPattern();
	private SingletonPattern() {
		System.out.println("インスタンスを生成しました");
	}

	/****************************************
	 * Description--Call the created instance
	 * @author gohir
	 *****************************************/
	public static SingletonPattern getInstance() {
		return sing;
	}
}
