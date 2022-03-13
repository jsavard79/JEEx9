/**
 * 
 */
package edu.nbcc.model;

/**
 * @author jensa
 *
 */
public class BookModel {
	private Book book = new Book();
	
	private final int[] terms = new int[] {1,2,3,4};
	
	public BookModel() {
		
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int[] getTerms() {
		return terms;
	}
	
}
