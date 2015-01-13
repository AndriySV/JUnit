package com.as.mockito.withDatabase.database;

import org.hibernate.Session;

public class UserDao {
	public void saveUser(User user) {
		Session session = null;

		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	public User findById(int id) {
		User user = null;
		Session session = null;

		try {
			session = HibernateUtil.getSessionFactory().openSession();
			user = (User) session.load(User.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				// session.close();
			}
		}
		return user;
	}

	public void deleteUser(User user) {
		Session session = null;

		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}

	}

}
