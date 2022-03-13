/**
 * 
 */
package edu.nbcc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jensa
 *
 */
public class Book {
	private int id;
	private String name;
	private double price;
	private int term;
		
	public Book() {}
	
	public Book(int id, String name, double price, int term) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.term = term;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getTerm() {
		return term;
	}
	
	public void setTerm(int term) {
		this.term = term;
	}
	
	private List<Book> mockData = new ArrayList<Book>();
	
	/**
	 * 
	 */
	private void buildMockData() {
		this.mockData.add(new Book(mockData.size() + 1, "Book 1", 19.99, 1));
		this.mockData.add(new Book(mockData.size() + 1, "Book 2", 29.99, 2));
		this.mockData.add(new Book(mockData.size() + 1, "Book 3", 79.99, 3));
		this.mockData.add(new Book(mockData.size() + 1, "Book 4", 39.99, 4));
		this.mockData.add(new Book(mockData.size() + 1, "Book 5", 49.99, 1));
		this.mockData.add(new Book(mockData.size() + 1, "Book 6", 9.99, 2));
		this.mockData.add(new Book(mockData.size() + 1, "Book 7", 15.99, 3));
		this.mockData.add(new Book(mockData.size() + 1, "Book 8", 27.99, 4));
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Book> getBooks(){
		buildMockData();
		return this.mockData;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Book getBook(int id) {
		getBooks();
		List<Book> query = mockData.stream().filter(b -> b.getId() == id).collect(Collectors.toList());
		if (query.size() > 0 ) {
			return query.get(0);
		} 
		return null;
	}
	
	/**
	 * 
	 * @return
	 */
	public Book create() {
		this.id = this.mockData.size() + 1;
		return this;
	}
	
	/**
	 * 
	 * @return
	 */
	public int saveBook() {
		if (getBook(this.id) != null) {
			return 1;
		}
		return 0;
	}
	
	/**
	 * 
	 * @return
	 */
	public int deleteBook() {
		if (getBook(this.id) != null) {
			return 1;
		}
		return 0;
	}
}
