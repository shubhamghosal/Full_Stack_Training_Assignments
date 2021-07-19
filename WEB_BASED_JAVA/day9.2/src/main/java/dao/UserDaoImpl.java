package dao;

import pojos.User;
import org.hibernate.*;
import static utils.HibernateUtils.getFactory;

import java.io.Serializable;

public class UserDaoImpl implements IUserDao {
//NO state (instance variables)
//NO constructor or cleanup required

	@Override
	public String addUserDetails(User user) {
		String mesg = "adding user details failed";
		// get session from SF
		Session session = getFactory().openSession(); // opens a new session(L1 cache: EMPTY)
		// begin transaction
		Transaction tx = session.beginTransaction();
		try {
			// CRUD API
			Serializable id = session.save(user); // adds ref of transient pojo to L1 cache:PERSISTENT
			System.out.println("id " + id);
			tx.commit(); // insertion of record
			mesg = "new user details added with id = " + id;
		} catch (RuntimeException e) {
			// failed!
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			// close session
			if (session != null)
				session.close(); // releases DB cn to cn pool AND L1 cache destroyed
		}
		return mesg;
	}

	@Override
	public User findByUserId(int userId) {
		User user = null;
		// get session from SF
		Session session = getFactory().openSession(); // opens a new session(L1 cache: EMPTY)
		// begin transaction
		Transaction tx = session.beginTransaction();
		try {
			// CRUD API
			user = session.get(User.class, userId);
			tx.commit(); // insertion of record
		} catch (RuntimeException e) {
			// failed!
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			// close session
			if (session != null)
				session.close(); // releases DB cn to cn pool AND L1 cache destroyed
		}
		return user;
	}
}
