package main.java.com.sourcebits;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional

public class ProductBean {
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Sgbros_Product> getproductdetails(){
		
		List<Sgbros_Product> list = new ArrayList<Sgbros_Product>();
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Sgbros_Product");
		list = query.list();
		return list;
	}
	@SuppressWarnings("unchecked")
	public List<Sgbros_Product> getProductDetailsById(int id){
		
		List<Sgbros_Product> list = new ArrayList<Sgbros_Product>();
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Sgbros_Product where id=:id");
		query.setParameter("id", id);
		list = query.list();
		return list;
	}
}
