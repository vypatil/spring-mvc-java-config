package com.demo.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.India;

@Repository
public class IndiaRepository {
	
	@Autowired
	  SessionFactory sessionFactory;
	
	public boolean saveIndiaToDb(India i) {
		
		boolean result = false;
		try {
			Session session = sessionFactory.openSession();
			Transaction txn = session.beginTransaction();
			session.save(i);
			txn.commit();
			session.close();
			result = true;
		}
		catch (Exception e) {
			System.out.println("Error occurred while storing the data : "+e.getMessage());
		}
		
		return result;
		
	}
	
	public List<India> viewAlldata(){
		
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		List<India> datalist = null;
		try {

			tx = session.beginTransaction();
			Query<India> query = session.createQuery("from India");
			datalist = query.list();
			tx.commit();

		} catch (HibernateException ex) {
			if (tx != null) {
				tx.rollback();
			}
			System.out.println("Exception: " + ex.getMessage());
			ex.printStackTrace(System.err);
		} 
		finally 
		{
			session.close();
			return datalist;
		}
		
		
	}

}
