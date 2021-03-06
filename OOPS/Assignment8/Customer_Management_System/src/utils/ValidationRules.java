package utils;

import static main.Customer.sdf;

import java.text.ParseException;
import java.util.Date;
import exception.CustomerException;
import main.Customer;
import main.CustomerType;

public final class ValidationRules {

	// Wrapper method
	public static final Customer getCustomer(String name, String email, String password, double amt, String date,
			String type, Customer[] customers) throws CustomerException {
		Date d = getDob(date);
		CustomerType t = getCustomerType(type);
		if (checkEmail(email) && checkPassword(password) && checkRegAmount(amt) && d != null && t != null) {
			for (Customer c : customers) {
				if (c != null)
					if (c.getEmail().equals(email))
						throw new CustomerException("Customer already exists!");
			}
		}
		return new Customer(name, email, password, amt, d, t);
	}

	// Helper functions
	private static boolean checkEmail(String email) throws CustomerException {
		String regex = "\\w+@\\w+\\.com";
		if (!email.matches(regex))
			throw new CustomerException("Email is wrong!");
		return true;
	}

	private static boolean checkPassword(String password) throws CustomerException {
		if (!(password.length() >= 4 && password.length() <= 10))
			throw new CustomerException("Password is wrong!");
		return true;
	}

	private static boolean checkRegAmount(double amt) throws CustomerException {
		if (!(amt % 500 == 0.0))
			throw new CustomerException("Amount is wrong!");
		return true;
	}

	private static Date getDob(String date) throws CustomerException {
		Date dob = null;
		Date when = null;
		try {
			dob = sdf.parse(date);
			when = sdf.parse("01-01-1995");
			if (!dob.before(when))
				throw new ParseException("", 0);
		} catch (ParseException e) {
			throw new CustomerException("Date is wrong!");
		}
		return dob;
	}

	private static CustomerType getCustomerType(String type) throws CustomerException {
		CustomerType t = null;
		try {
			t = CustomerType.valueOf(type.toUpperCase());
		} catch (IllegalArgumentException e) {
			throw new CustomerException("CustomerType is wrong!");
		}
		return t;
	}
}