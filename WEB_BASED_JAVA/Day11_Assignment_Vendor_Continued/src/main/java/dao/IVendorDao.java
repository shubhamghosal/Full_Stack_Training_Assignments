package dao;

import java.time.LocalDate;
import java.util.List;

import pojos.Vendor;

public interface IVendorDao {
	String addVendorDetails(Vendor v);
	Vendor vendorDetails(long vendorId);
	List<Vendor> allVendorDetails();
	String registerVendor(Vendor v);
	String authenticateVendor(String email, String pass);
	String updateRegAmount(String email,double offset);
	String deleteVendorDetails(double regAmt, LocalDate regDate);
}