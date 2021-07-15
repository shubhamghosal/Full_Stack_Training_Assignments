package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import main.Book;

public interface IOUtils {
	static void storeData(Map<String, Book> books, String fileName) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(books);
		}
	}

	@SuppressWarnings("unchecked")
	static Map<String, Book> restoreData(String fileName) {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
			return (Map<String, Book>) in.readObject();
		} catch (Exception e) {
			return new HashMap<>();
		}
	}

}
