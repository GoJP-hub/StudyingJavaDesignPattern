package designpattern.iterator;

public class MainIterator {
	public static void main(String[] args) {
		/****************************************
		 * Description--Create bookshelf
		 * <p>Define the capacity of bookshelf</p>
		 * @author gohir
		 *****************************************/
		BookShelf bookshelf = new BookShelf(4);

		/****************************************
		 * Description--add the books
		 * @author gohir
		 * @param Book
		 *****************************************/
		bookshelf.appendBook(new Book("1st book"));
		bookshelf.appendBook(new Book("2nd book"));
		bookshelf.appendBook(new Book("3rd book"));
		bookshelf.appendBook(new Book("4th book"));

		/****************************************
		 * Description--create an iterator specified by the aggregator (bookshelf)
		 * @author gohir
		 * @param Book
		 *****************************************/
		Iterator it = bookshelf.useIterator();

		while(it.hasNextItem()) {
			Book book = (Book)it.getNextItem();
			System.out.println(book.getName());
		}
	}
}
