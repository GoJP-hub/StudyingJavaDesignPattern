package designpattern.iterator;

public class BookShelfIterator implements Iterator {
	/****************************************
	 * Description--Parameters for using the Iterator
	 * <p>bookshelf is subject of iterator, <br>
	 * index is key to know which object to select</p>
	 * @author gohir
	 *****************************************/
	private BookShelf bookshelf;
	private int index;

	/****************************************
	 * Description--Create Iterator instance
	 * @author gohir
	 * @param BookShelf
	 *****************************************/
	public BookShelfIterator(BookShelf bookshelf) {
		this.bookshelf = bookshelf;
		this.index = 0;
	}

	/****************************************
	 * Description--Assert next item
	 * <p>assert based on length of bookshelf</p>
	 * @author gohir
	 *****************************************/
	public boolean hasNextItem() {
		if(index < bookshelf.getLength()) {
			return true;
		}else {
			return false;
		}
	}

	/****************************************
	 * Description--Get the book
	 * <p>get the book based on index which increments</p>
	 * @author gohir
	 *****************************************/
	public Object getNextItem() {
		Book book = bookshelf.getBookAt(index);
		index++;
		return book;
	}
}
