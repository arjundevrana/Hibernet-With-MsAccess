

package com.msaccess.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernet.config.HibernateUtil;
import com.msaccess.bean.Account;

public class App {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tran = session.beginTransaction();
		List<Account> account = new ArrayList<>(); 
		account = session.createQuery("FROM Account").list();
		System.out.println(account);
		List<Account> advances = new ArrayList<>(); 
		advances = session.createQuery("FROM Advances").list();
		System.out.println(advances);
		tran.commit();
		session.close();
	}
}