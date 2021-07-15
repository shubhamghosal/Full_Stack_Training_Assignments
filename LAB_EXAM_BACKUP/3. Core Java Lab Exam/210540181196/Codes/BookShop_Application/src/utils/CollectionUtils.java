package utils;

import java.util.HashMap;
import java.util.Map;
import static main.CategoryEnum.*;
import main.Book;
import static java.time.LocalDate.parse;
// Populating the bookshop with hardcoded data
public interface CollectionUtils {
	static Map<String, Book> populateBookMap() {
		HashMap<String, Book> map = new HashMap<>();
		map.put("book1", new Book("book1", "Shubham", 1500, TECHNOLOGY, parse("2015-01-01")));
		map.put("book2", new Book("book2", "Ravi", 1200, FICTION, parse("2015-02-01")));
		map.put("book3", new Book("book3", "Krishna", 500, SPORTS, parse("2015-03-01")));
		map.put("book4", new Book("book4", "Sujay", 800, HEALTH, parse("2015-04-01")));
		map.put("book5", new Book("book5", "Priya", 500, COMICS, parse("2015-05-01")));
		return map;
	}
}
