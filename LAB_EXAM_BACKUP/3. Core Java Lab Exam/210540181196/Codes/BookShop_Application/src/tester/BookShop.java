package tester;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

import main.Book;
import utils.CollectionUtils;
import exception.BookHandlingException;
// Supplying the required options for bookstore implementation
public class BookShop {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<String, Book> books = new HashMap<>(CollectionUtils.populateBookMap());
			HashMap<String, Book> cart = new HashMap<>();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("Option 1. Display books from shop");
					System.out.println("Option 2. Add a Book to cart");
					System.out.println("Option 3. Show Cart Contents");
					System.out.println("Option 4. Checkout(Exit)");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Books available in Store:");
						for (Book a : books.values())
							System.out.println(a);
						break;
					case 2:
						System.out.println("Enter book title: ");
						String title = sc.next();
						Book demand = books.get(title);
						if (demand == null) {
							throw new BookHandlingException("Book not available in bookshop..!!");
						} else {
							System.out.println("Book Succesfully Added to the Cart!!!!");
							cart.put(title, books.get(title));
						}
						break;
					case 3:
						System.out.println("The contents of the cart...");
						for (Book a : cart.values())
							System.out.println(a);
						break;
					case 4:
						System.out.println("Books Purchased via cart: ");
						double sum = 0;
						for (Book a : cart.values()) {
							sum += a.getPrice();
							System.out.println("Title: " + a.getTitle() + " " + "Price: " + a.getPrice());
						}
						System.out.println("Total value of cart: Rs." + sum);

						try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("cart.ser"))) {
							out.writeObject(cart);
							System.out.println("\nCart contents saved to cart.ser");
						} catch (IOException e) {
							throw new BookHandlingException("Cannot write to file!");
						}
						exit = true;
						break;

					}

				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();
			}
		}

	}

}
