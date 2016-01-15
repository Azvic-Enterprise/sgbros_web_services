package main.java.com.sourcebits;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class LoginBean {
	
	@Autowired
	private SessionFactory sessionFactory;
/*	
	@SuppressWarnings("unchecked")
	public List<Mark> getMarks(){
		
		List<Mark> list = new ArrayList<Mark>();
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Mark");
		list = query.list();
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<Mark> getMarksById(int id){
		
		List<Mark> list = new ArrayList<Mark>();
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Mark where id=:id");
		query.setParameter("id", id);
		list = query.list();
		return list;
	}
	*/
	//@SuppressWarnings("unchecked")
	public String getlogindetails(String login,String password){
		
		Res_Users list = new Res_Users();
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Res_Users where login=:login");
		query.setParameter("login", login);
		list = (Res_Users) query.uniqueResult();
		if(list!= null)
		{
	    if(login.equals(list.getlogin().toString()) && password.equals(list.getPassword().toString()))
	    {
	    	return "successful";
	    }
	    else
	    {	    
	    	return "unsuccessful";
	    }
		}
	   else
	    {	    
	    	return "unsuccessful";
	    }

		
	}
	
	//@SuppressWarnings("unchecked")
	public String getInstallerLogin(String  email,String mobile){
		
		Sgbros_Contractor list = new Sgbros_Contractor();
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Sgbros_Contractor where email=:email");
		query.setParameter("email", email);
		list = (Sgbros_Contractor) query.uniqueResult();
		if(list!= null)
		{
	    if(email.equals(list.getEmail().toString()) && mobile.equals(list.getMobile().toString()))
	    {
	    	return "successful";
	    }
	    else
	    	
	    {
	    	return "unsuccessful";
	    }
		}
	    else
	    {
	    	return "unsuccessful";
	    }
		
		
		//return list;
	}
	public String getSalesMenLogin(String login,String phone){
		
		Sgbros_Salesman list = new Sgbros_Salesman();
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Sgbros_Salesman where email=:id");
		query.setParameter("id", login);
		list = (Sgbros_Salesman) query.uniqueResult();
		if(list!= null)
		{
	    if(login.equals(list.getEmail().toString()) && phone.equals(list.getMobile().toString()))
	    {
	    	return "successful";
	    }
	    else
	    	
	    {
	    	return "unsuccessful";
	    }
		}
	    else
	    {
	    	return "unsuccessful";
	    }
	}
}
