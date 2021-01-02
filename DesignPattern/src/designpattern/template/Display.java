package designpattern.template;

public abstract class Display {
	/****************************************
	 * Description--Template methods to implement at child class
	 * <p>open()/print()/close()</p>
	 * @author gohir
	 *****************************************/
	public abstract void open();

	public abstract void print();

	public abstract void close();

	/****************************************
	 * Description--Base methods for display
	 * @author gohir
	 *****************************************/
	public final void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}

}
