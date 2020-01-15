package ddv;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		main_Test mt = new main_Test();
		mt.Test_user_watchlist();

}
	
public void Test_user_watchlist() 
{
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	
	User u = new User();
	u.setUid(102);
	u.setUname("raj");
	
	Youwatchlist y = new Youwatchlist();
	y.setYwlid(188);
	y.setYwlname("watchlist1");
	y.setUser(u);
	
	Transaction tx = session.beginTransaction();
	session.save(y);
	tx.commit();
	session.close();
	factory.close();

}	
}