package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Test {

	public static void main(String[] args) {


		SessionFactory sfact = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session sess = sfact.openSession();
		Student ob = new Student();
		ob.setName("swati");
		ob.setAddress("faridabad");

		sess.beginTransaction();
		sess.persist(ob);
		sess.getTransaction().commit();

		System.out.println("done");


	}

}
