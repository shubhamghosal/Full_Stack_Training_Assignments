package main;

import java.time.LocalDate;
// Core Book Class
public class Book {
	
	private String title;
	private String author;
	private double price;
	private CategoryEnum category;
	private transient LocalDate publishDate;

	public Book(String title, String author, double price, CategoryEnum category, LocalDate publishDate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
		this.publishDate = publishDate;
		
	}
	@Override
	public String toString() {
		return "Book [Title=" + title + ", Author=" + author + ", Price=" + price + ", Category=" + category
				+ ", publishDate=" + publishDate + "]";
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public CategoryEnum getCategory() {
		return category;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	
}
