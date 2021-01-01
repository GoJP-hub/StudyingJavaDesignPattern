package designpattern.iterator;

public class BookShelf implements Aggregate {
	private Book[] bookshelf;
	private int lastBookNo = 0;

	/****************************************
	 * Description--Creating a list (object) of shelf
	 * @author gohir
	 * @param int maxShelfSize
	*****************************************/
	public BookShelf(int maxShelfSize) {
		this.bookshelf = new Book[maxShelfSize];
	}

	/****************************************
	 * Description--get the book
	 * @author gohir
	 * @param int index
	 * @return Book[]
	 *****************************************/
	public Book getBookAt(int index) {
		return bookshelf[index];
	}

	/****************************************
	 * Description--append(add) the book
	 * @author gohir
	 * @param Book
	 *****************************************/
	public void appendBook(Book book) {
		this.bookshelf[lastBookNo]=book;
		lastBookNo++;
	}

	/****************************************
	 * Description--get the the number of books in the shelf
	 * @author gohir
	 * @return int lastBookNo
	 *****************************************/
	public int getLength() {
		return lastBookNo;
	}

	/****************************************
	 * Description--Using the iterator
	 * @author gohir
	 * @return BookShelfIterator
	 *****************************************/
	public Iterator useIterator() {
		return new BookShelfIterator(this);
	}

}
