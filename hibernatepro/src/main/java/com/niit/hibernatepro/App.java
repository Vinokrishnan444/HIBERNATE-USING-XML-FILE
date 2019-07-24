package com.niit.hibernatepro;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.niit.hibernatepro.model.Department;
import com.niit.hibernatepro.model.Employee;
public class App 
{
 public static void main( String[] args )
    {
	 Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		Employee e = new Employee();
		
		e.setEmpname("vinodhini");
		e.setEmpdesig("Manager");
		e.setEmpdept("HR");
		
		Department e1 = new Department();
		e1.setDeptname("vino");
		
		Session s=sessionFactory.openSession();
		Transaction txt=s.beginTransaction();
		s.save(e);
		s.save(e1);
		txt.commit();
		s.close();
		sessionFactory.close();
}}