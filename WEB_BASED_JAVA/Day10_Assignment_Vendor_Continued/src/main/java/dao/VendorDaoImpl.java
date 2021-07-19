package dao;

import static utils.HibernateUtils.getFactory;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Vendor;

public class VendorDaoImpl implements IVendorDao {

	@Override
	public String addVendorDetails(Vendor v) {
		String msg = "Adding vendor details failed.";
		Session session = getFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			Serializable id = session.save(v);
			System.out.println("Adding vendor id: " + id);
			tx.commit();
			msg = "New vendor added with id: " + id;
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			if (session != null)
				session.close();
		}
		return msg;
	}

	@Override
	public Vendor vendorDetails(long vendorId) {
		Vendor vendor;
		Session session = getFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			vendor = session.get(Vendor.class, vendorId);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			if (session != null)
				session.clear();
		}
		return vendor;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vendor> allVendorDetails() {
		List<Vendor> vendorList;
		Session session = getFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			vendorList = session.createQuery("from Vendor").list();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			if (session != null)
				session.clear();
		}
		return vendorList;
	}

	@Override
	public String registerVendor(Vendor v) {
		String mesg = "Registering new vendor failed....";
		Session session = getFactory().openSession();
		Session session2 = getFactory().openSession();
		System.out.println(session == session2);
		Transaction tx = session.beginTransaction();
		System.out.println("Session is open " + session.isOpen() + " connected " + session.isConnected());
		try {
			Long id = (Long) session.save(v);
			tx.commit();
			System.out.println("Session is open " + session.isOpen() + " connected " + session.isConnected());
			mesg = "Vendor registered successfully with ID " + id;
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			if (session != null)
				session.close();
		}
		System.out.println("session is open " + session.isOpen() + " connected " + session.isConnected());
		return mesg;
	}

	@Override
	public String authenticateVendor(String email, String pass) {
		String mesg = "Vendor Login...";
		String jpql = "select v from Vendor v where v.email=:email and v.password=:pass";
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		try {
			Vendor v = session.createQuery(jpql, Vendor.class).setParameter("email", email).setParameter("pass", pass)
					.getSingleResult();
			mesg = "Vendor Login Succesfull..." + v;
		} catch (NoResultException e) {
			if (tx != null)
				tx.rollback();
			mesg = "Vendor Login Failed...";
			throw e;
		} finally {
			if (session != null)
				session.close();
		}

		return mesg;
	}

	@Override
	public String updateRegAmount(String email, double offset) {
		String mesg = "Vendor Reg Amount Update...";
		String jpql = "select v from Vendor v where v.email=:email";
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		try {
			Vendor v = session.createQuery(jpql, Vendor.class).setParameter("email", email).getSingleResult();
			v.setRegAmount(v.getRegAmount() + offset);
			tx.commit();
			mesg = "Vendor Registration Amount Updated to..." + v;
		} catch (NoResultException e) {
			if (tx != null)
				tx.rollback();
			mesg = "Invalid Email...Updation Failed...";
			throw e;
		} finally {
			if (session != null)
				session.close();
		}
		return mesg;
	}

	@Override
	public String deleteVendorDetails(double regAmt, LocalDate regDate) {
		String mesg = "Vendor Deletion...";
		String jpql = "delete from Vendor v where v.regAmount<:regAmt and v.regDate>:regDate";
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		try {
			int count = session.createQuery(jpql).setParameter("regAmt", regAmt).setParameter("regDate", regDate)
					.executeUpdate();
			mesg = "Vendor details deletion succeeded for " + count + " entry...";
		} catch (NoResultException e) {
			if (tx != null)
				tx.rollback();
			mesg = "Invalid Entry...Deletion Failed...";
			throw e;
		} finally {
			if (session != null)
				session.close();
		}
		return mesg;
	}

}