package com.amazoneprime;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main_Test mt = new Main_Test();
		//mt.Test_user_watchlist();
		//mt.Test_watchlist_youwatchlist();
		//mt.Test_User_AccountSetting();
		//mt.Test_YourAccount_AccountSetting();
		//mt.Test_youraccount_yourdetail();
		//mt.Test_Youraccount_prime();
		//mt.Test_Youracount_YourPaymentHistory();
		//mt.Test_Playback_AccountSetting();
		//mt.Test_Playback_Autoplay();
		//mt.Test_ParentalControl_AccountSetting();
		//mt.Test_ParentalControl_primevideopin();
		//mt.Test_Subtitle_AccountSetting();
		//mt.Test_Subtitle_SubtitleDetail();
		//mt.Test_YourDevice_AccountSetting();
		//mt.Test_YourDevice_RegisterDevice();
		//mt.Test_Language_AccountSetting();
		//mt.Test_Language_Websitelanguage();
		//mt.Test_WatchHistory_AccountSetting();
		//mt.Test_watchhistory_watchhistorydetail();
		//mt.Test_user_Watchanywhere();
		//mt.Test_watchanywhere_watchanywheredetail();
		//mt.Test_user_Help();
		//mt.Test_Help_HelpDetail();
		//mt.Test_user_SignOut();
		//mt.Test_user_Home();
		//mt.Test_user_Tvshows();
		//mt.Test_user_Movies();
		//mt.Test_user_Kids();
		//mt.Test_Kids_Family_Movies();
		//mt.Test_Kids_FamilyTV();
		//mt.Test_Kids_AOKS();
		//mt.Test_Movie_ComedyMovies();
		//mt.Test_Movie_DramaMovie();
		//mt.Test_Movie_ThrillerMovie();
		//mt.Test_TVShows_ActionAdventureTV();
		//mt.Test_TVShows_ThrowvackTV();
		//mt.Test_TVShows_ThreandingTV();
		//mt.Test_kidsmovie_kidsmoviedetail();
		//mt.Test_kidstv_kids_familytvdetail();
		//mt.Test_amazone_original_series_detail();
		//mt.Test_comdeyMoviedetail();
		//mt.Test_dramaMoviedetail();
		//mt.Test_ThrillerMoviedetail();
		//mt.Test_Action_adventureDetail();
		//mt.Test_ThrowbackTVDetail();
		//mt.Test_TreandingTVdetail();
}
	
public void Test_user_watchlist() 
{
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	
	User u = new User();
	u.setUserid(101);
	u.setUsername("rajesh");
	
	YourWatchList y = new YourWatchList();
	y.setYwlid(104);
	y.setYwlname("watchlist");
	y.setParent(u);
	
	Transaction tx = session.beginTransaction();
	session.save(y);
	tx.commit();
	session.close();
	factory.close();

}	

public void Test_watchlist_youwatchlist() 
{
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	YourWatchList v=(YourWatchList)session.get(YourWatchList.class,104);

	WatchlistDetail c1 = new WatchlistDetail();
	c1.setWatchlistdetailid(304);
	c1.setListitemname("test12");;

	WatchlistDetail c2 = new WatchlistDetail();
	c2.setWatchlistdetailid(305);
	c2.setListitemname("test");;

	Set s = new HashSet();
	s.add(c1);
	s.add(c2);

	v.setParents(s);;

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to Many Annotatios Done...!!!!!!");
	factory.close();

}

public void Test_User_AccountSetting() 
{
	
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	User u=(User)session.get(User.class,101);
	
	AccountSetting v = new AccountSetting();
	v.setAccountSettingid(401);
	v.setAccountSettingname("account setting name");
	v.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_YourAccount_AccountSetting() 
{
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	AccountSetting u=(AccountSetting)session.get(AccountSetting.class,401);
	
	YourAccount v = new YourAccount();
	v.setYouaccountid(501);
	v.setYouaccountname("your account");;
	v.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();

}

public void Test_youraccount_yourdetail() 
{
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	YourAccount u=(YourAccount)session.get(YourAccount.class,501);
	
	YourDetail v = new YourDetail();
	v.setYourdetailid(601);
	v.setYourdetailname("you detail");;

	Set s = new HashSet();
	s.add(v);

	u.setChildren(s);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to Many Annotatios Done...!!!!!!");
	factory.close();

}

public void Test_Youraccount_prime() 
{
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	YourAccount u=(YourAccount)session.get(YourAccount.class,501);
	
	YourDetail v = new YourDetail();
	v.setYourdetailid(601);
	v.setYourdetailname("you detail");;

	Set s = new HashSet();
	s.add(v);

	u.setChildren(s);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to Many Annotatios Done...!!!!!!");
	factory.close();

}

public void Test_Youracount_YourPaymentHistory() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	YourAccount u=(YourAccount)session.get(YourAccount.class,501);
	
	YourPaymenHistory v = new YourPaymenHistory();
	v.setYoupamenthistoryid(803);;
	v.setYoupamenthistoryname("your payment name");;


	Set s = new HashSet();
	s.add(v);

	u.setChildren2(s);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to Many Annotatios Done...!!!!!!");
	factory.close();
}
public void Test_Playback_AccountSetting() 
{
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	AccountSetting u=(AccountSetting)session.get(AccountSetting.class,401);
	
	Playback v = new Playback();
	v.setPlaybackid(1000);;
	v.setPlaybackname("play back name");;
	v.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_Playback_Autoplay() 
{
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	Playback u=(Playback)session.get(Playback.class,1000);
	
	Autoplay v = new Autoplay();
	v.setAutoplayid(1100);
	v.setAutoplayname("auto play name");
	v.setParent1(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_ParentalControl_AccountSetting() 
{
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	AccountSetting u=(AccountSetting)session.get(AccountSetting.class,401);
	
	ParentalControl v = new ParentalControl();
	v.setParentalid(1200);
	v.setParentalname("parent control name");
	v.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_ParentalControl_primevideopin() 
{
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	ParentalControl u=(ParentalControl)session.get(ParentalControl.class,1200);
	
	PrimeVideopin v = new PrimeVideopin();
	v.setPrimevideopinid(1300);
	v.setPrimevideopinname("prime video pin name");
	v.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_Subtitle_AccountSetting() 
{
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	AccountSetting u=(AccountSetting)session.get(AccountSetting.class,401);
	
	Subtitle v = new Subtitle();
	v.setSubtitleid(1400);
	v.setSubtitlename("subtitle name");
	v.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}
public void Test_Subtitle_SubtitleDetail() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	Subtitle u=(Subtitle)session.get(Subtitle.class,1400);
	
	Subtitledetail v = new Subtitledetail();
	v.setSubtitleid(1500);
	v.setSubtitlename("subtitle present");
	

	Subtitledetail v1 = new Subtitledetail();
	v.setSubtitleid(1501);
	v.setSubtitlename("default present");
	
	Set s = new HashSet();
	s.add(v);
	s.add(v1);

	u.setChildren(s);

	Transaction tx = session.beginTransaction();
	session.save(u);
	tx.commit();

	session.close();
	System.out.println("One to Many Annotatios Done...!!!!!!");
	factory.close();
}
public void Test_YourDevice_AccountSetting() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	AccountSetting u=(AccountSetting)session.get(AccountSetting.class,401);
	
	YourDevice v = new YourDevice();
	v.setYourdeviceid(1600);
	v.setYourdevicename("your device name");
	v.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_YourDevice_RegisterDevice() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml"); 

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();		

	YourDevice u=(YourDevice)session.get(YourDevice.class,1600);

      RegisterDevice c1=new RegisterDevice();
      c1.setRegisterid(1700);
      c1.setRegistername("androide device");

      RegisterDevice c2=new RegisterDevice();
      c2.setRegisterid(1701);
      c2.setRegistername("iso device");

      Set s=new HashSet();
      s.add(c1);
      s.add(c2);

      u.setChildren(s);

      Transaction tx=session.beginTransaction();
      session.save(u);
      tx.commit();

	session.close();
	System.out.println("One to Many Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_Language_AccountSetting() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	AccountSetting u=(AccountSetting)session.get(AccountSetting.class,401);
	
	Language v = new Language();
	v.setLanguageid(1800);
	v.setLanguragename("languragename");
	v.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}
public void Test_Language_Websitelanguage() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml"); 

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();		

	Language u=(Language)session.get(Language.class,1800);

      Websitelanguage c1=new Websitelanguage();
      c1.setWeblanguageid(1900);
      c1.setWeblanguagename("hindi");

      Websitelanguage c2=new Websitelanguage();
      c2.setWeblanguageid(1901);
      c2.setWeblanguagename("english");
      
      Websitelanguage c3=new Websitelanguage();
      c3.setWeblanguageid(1902);
      c3.setWeblanguagename("italic");

      Set s=new HashSet();
      s.add(c1);
      s.add(c2);
      s.add(c3);
      
      u.setChildren(s);

      Transaction tx=session.beginTransaction();
      session.save(u);
      tx.commit();

	session.close();
	System.out.println("One to Many Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_WatchHistory_AccountSetting() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	AccountSetting u=(AccountSetting)session.get(AccountSetting.class,401);
	
	WatchHistory v = new WatchHistory();
	v.setWatchhistoryid(2000);
	v.setWatchhistoryname("watch history name");
	v.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}
public void Test_watchhistory_watchhistorydetail() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml"); 

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();		

	WatchHistory u=(WatchHistory)session.get(WatchHistory.class,2000);

      Watchhistorydetail c1=new Watchhistorydetail();
      c1.setWatchhistorydetailid(2100);
      c1.setWatchhistorydetailname("watch history name");

      Watchhistorydetail c2=new Watchhistorydetail();
      c2.setWatchhistorydetailid(2101);
      c2.setWatchhistorydetailname("watch history name1");

      Set s=new HashSet();
      s.add(c1);
      s.add(c2);
      
      u.setChildren(s);

      Transaction tx=session.beginTransaction();
      session.save(u);
      tx.commit();

	session.close();
	System.out.println("One to Many Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_user_Watchanywhere() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	User u=(User)session.get(User.class,101);
	
	WatchAnywhere v = new WatchAnywhere();
	v.setWatchanywhereid(2200);
	v.setWatchanywherename("watch anywhere name");
	v.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_watchanywhere_watchanywheredetail() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml"); 

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();		

	WatchAnywhere u=(WatchAnywhere)session.get(WatchAnywhere.class,2200);

      watchanywheredetail c1=new watchanywheredetail();
      c1.setWatchanywheredetailid(2300);
      c1.setWatchanywheredetailname("Fire TV Stick");

      watchanywheredetail c2=new watchanywheredetail();
      c2.setWatchanywheredetailid(2301);
      c2.setWatchanywheredetailname("Smart TV");

      Set s=new HashSet();
      s.add(c1);
      s.add(c2);
      
      u.setChildren(s);

      Transaction tx=session.beginTransaction();
      session.save(u);
      tx.commit();

	session.close();
	System.out.println("One to Many Annotatios Done...!!!!!!");
	factory.close();
}
public void Test_user_Help() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	User u=(User)session.get(User.class,101);
	
	Help v = new Help();
	v.setHelpid(2500);
	v.setHelpname("help name");
	v.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_Help_HelpDetail() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml"); 

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();		

	Help u=(Help)session.get(Help.class,2500);

      HelpDetail c1=new HelpDetail();
      c1.setHelpdetailid(2600);
      c1.setHelpdetailname("setting up prime video");

      HelpDetail c2=new HelpDetail();
      c2.setHelpdetailid(2601);
      c2.setHelpdetailname("prime video channle");
      
      HelpDetail c3=new HelpDetail();
      c3.setHelpdetailid(2602);
      c3.setHelpdetailname("Troubleshooting");

      Set s=new HashSet();
      s.add(c1);
      s.add(c2);
      s.add(c3);
      
      u.setChildren(s);

      Transaction tx=session.beginTransaction();
      session.save(u);
      tx.commit();

	session.close();
	System.out.println("One to Many Annotatios Done...!!!!!!");
	factory.close();
}
public void Test_user_SignOut() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	User u=(User)session.get(User.class,101);
	
	SignOut v = new SignOut();
	v.setSignoutid(2700);
	v.setSignoutname("signout name");
	v.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_user_Home() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	User u=(User)session.get(User.class,101);
	
	Home v = new Home();
	v.setHomeid(2800);
	v.setHomename("Home name");
	v.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}
public void Test_user_Tvshows() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	User u=(User)session.get(User.class,101);
	
	Tv_shows v = new Tv_shows();
	v.setTv_showsid(2900);
	v.setTv_showsname("tv show name");
	v.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}
public void Test_user_Movies() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	User u=(User)session.get(User.class,101);
	
	Movies v = new Movies();
	v.setMoviesid(3000);
	v.setMoviesname("movie name");
	v.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_user_Kids() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	User u=(User)session.get(User.class,101);
	
	Kids v = new Kids();
	v.setKidsid(3100);
	v.setKidsname("kids name");
	v.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}
public void Test_Kids_Family_Movies() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	Kids u=(Kids)session.get(Kids.class,3100);
	
	Home h=(Home)session.get(Home.class,2800);
	
	Kids_familyMovie v = new Kids_familyMovie();
	v.setKids_familyMovieid(3200);
	v.setKids_familyMoviename("kids & family name");
	v.setParent(u);
	v.setParent1(h);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_Kids_FamilyTV() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	Kids u=(Kids)session.get(Kids.class,3100);
	
	Home h=(Home)session.get(Home.class,2800);
	
	Kids_familyTV v = new Kids_familyTV();
	v.setKids_familytvid(3300);
	v.setKids_familytvname("kids familytv name");
	v.setParent(u);
	v.setParent_Home(h);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_Kids_AOKS() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	Kids u=(Kids)session.get(Kids.class,3100);
	
	Home h=(Home)session.get(Home.class,2800);
	
	AmazoneOriginalKidsSeries v = new AmazoneOriginalKidsSeries();
	v.setAoksid(3400);
	v.setAoksname("amazone original kids series");
	v.setParent(u);
	v.setParent_home(h);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_Movie_ComedyMovies() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	Movies u=(Movies)session.get(Movies.class,3000);
	
	Home h=(Home)session.get(Home.class,2800);
	
	ComedyMovies v = new ComedyMovies();
	v.setComedymovieid(3500);
	v.setComedymoviename("comedy movies name");
	v.setParent(u);
	v.setParent_Home(h);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_Movie_DramaMovie() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	Movies u=(Movies)session.get(Movies.class,3000);
	
	Home h=(Home)session.get(Home.class,2800);
	
	DramaMovie v = new DramaMovie();
	v.setDramamoviesid(3700);
	v.setDramamoviesname("drama movies name");
	v.setParent(u);
	v.setParent_Home(h);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_Movie_ThrillerMovie() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	Movies u=(Movies)session.get(Movies.class,3000);
	
	Home h=(Home)session.get(Home.class,2800);
	
	ThrillerMovie v = new ThrillerMovie();
	v.setThrillermovieid(3900);
	v.setThrillermoviename("thriller movie name");
	v.setParent(u);
	v.setParent_Home(h);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}
public void Test_TVShows_ActionAdventureTV() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	Tv_shows u=(Tv_shows)session.get(Tv_shows.class,2900);
	
	Home h=(Home)session.get(Home.class,2800);
	
	Action_AdventureTV v = new Action_AdventureTV();
	v.setActionAdventureid(4000);
	v.setActionAdventurename("action adventure name");
	v.setParent(u);
	v.setParent_Home(h);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_TVShows_ThrowvackTV() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	Tv_shows u=(Tv_shows)session.get(Tv_shows.class,2900);
	
	Home h=(Home)session.get(Home.class,2800);
	
	ThrowbackTV v = new ThrowbackTV();
	v.setThrowbackTVid(4100);
	v.setThrowbackTVname("throwbackTV name");
	v.setParent(u);
	v.setParent_Home(h);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_TVShows_ThreandingTV() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	Tv_shows u=(Tv_shows)session.get(Tv_shows.class,2900);
	
	Home h=(Home)session.get(Home.class,2800);
	
	
	TreandingTV v = new TreandingTV();
	v.setTreandingtvid(4200);
	v.setTreandingtvname("treanding tv name");
	v.setParent(u);
	v.setParent_Home(h);

	Transaction tx = session.beginTransaction();
	session.save(v);
	tx.commit();

	session.close();
	System.out.println("One to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_kidsmovie_kidsmoviedetail() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	Kids_familyMovie u=(Kids_familyMovie)session.get(Kids_familyMovie.class,3200);
	
	Kids_familyMovieDetail v = new Kids_familyMovieDetail();
	v.setKids_familyMovieDetailid(4300);
	v.setKids_familyMovieDetailname("HarryPotter I");
	v.setParent(u);
	
	Kids_familyMovieDetail v1 = new Kids_familyMovieDetail();
	v1.setKids_familyMovieDetailid(4301);
	v1.setKids_familyMovieDetailname("HarryPotter II");
	v1.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	session.save(v1);
	tx.commit();

	session.close();
	System.out.println("Many to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_kidstv_kids_familytvdetail() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	Kids_familyTV u=(Kids_familyTV)session.get(Kids_familyTV.class,3300);
	
	Kids_familyTVdetail v = new Kids_familyTVdetail();
	v.setKids_familyTvdetailid(4400);
	v.setKids_familyTvdetailname("Kung fu panda");
	v.setParent(u);
	
	Kids_familyTVdetail v1 = new Kids_familyTVdetail();
	v1.setKids_familyTvdetailid(4401);
	v1.setKids_familyTvdetailname("selfi with bajrangi");
	v1.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	session.save(v1);
	tx.commit();

	session.close();
	System.out.println("Many to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_amazone_original_series_detail() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	AmazoneOriginalKidsSeries u=(AmazoneOriginalKidsSeries)session.get(AmazoneOriginalKidsSeries.class,3400);
	
	AmazoneOriginalkidsSeriesdetail v = new AmazoneOriginalkidsSeriesdetail();
	v.setAmazoneSeriesid(4500);
	v.setAmazoneSeriesname("just add magic");
	v.setParent(u);
	
	AmazoneOriginalkidsSeriesdetail v1 = new AmazoneOriginalkidsSeriesdetail();
	v1.setAmazoneSeriesid(4501);
	v1.setAmazoneSeriesname("summer camp");
	v1.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	session.save(v1);
	tx.commit();

	session.close();
	System.out.println("Many to One Annotatios Done...!!!!!!");
	factory.close();
}
public void Test_comdeyMoviedetail() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	ComedyMovies u=(ComedyMovies)session.get(ComedyMovies.class,3500);
	
	ComedyMovieDetail v = new ComedyMovieDetail();
	v.setComedyMoviedetailid(4600);
	v.setComedyMoviedetailname("andaze apna apna");
	v.setParent(u);
	
	ComedyMovieDetail v1 = new ComedyMovieDetail();
	v1.setComedyMoviedetailid(4601);
	v1.setComedyMoviedetailname("welcome");
	v1.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	session.save(v1);
	tx.commit();

	session.close();
	System.out.println("Many to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_dramaMoviedetail() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	DramaMovie u=(DramaMovie)session.get(DramaMovie.class,3700);
	
	DramaMovieDetail v = new DramaMovieDetail();
	v.setDramamoviedetailid(4700);
	v.setDramamoviedetailname("newton");
	v.setParent(u);
	
	DramaMovieDetail v1 = new DramaMovieDetail();
	v1.setDramamoviedetailid(4701);
	v1.setDramamoviedetailname("bewakoofiyaan");
	v1.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	session.save(v1);
	tx.commit();

	session.close();
	System.out.println("Many to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_ThrillerMoviedetail() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	ThrillerMovie u=(ThrillerMovie)session.get(ThrillerMovie.class,3900);
	
	ThrillerMovieDetail v = new ThrillerMovieDetail();
	v.setThrillermoviedetailid(4800);
	v.setThrillermoviedetailname("annabelle");
	v.setParent(u);
	
	ThrillerMovieDetail v1 = new ThrillerMovieDetail();
	v1.setThrillermoviedetailid(4801);
	v1.setThrillermoviedetailname("bhool bhulaiyaa");
	v1.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	session.save(v1);
	tx.commit();

	session.close();
	System.out.println("Many to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_Action_adventureDetail() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	Action_AdventureTV u=(Action_AdventureTV)session.get(Action_AdventureTV.class,4000);
	
	Action_adventureTVDetail v = new Action_adventureTVDetail();
	v.setAction_adventureTVDetailid(4900);
	v.setAction_adventureTVDetailname("Taken");
	v.setParent(u);
	
	Action_adventureTVDetail v1 = new Action_adventureTVDetail();
	v1.setAction_adventureTVDetailid(4901);
	v1.setAction_adventureTVDetailname("supernatural");
	v1.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	session.save(v1);
	tx.commit();

	session.close();
	System.out.println("Many to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_ThrowbackTVDetail() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	ThrowbackTV u=(ThrowbackTV)session.get(ThrowbackTV.class,4100);
	
	ThrowbackTVDetail v = new ThrowbackTVDetail();
	v.setThrowbacktvdetailid(5000);
	v.setThrowbacktvdetailname("shaktiman");
	v.setParent(u);
	
	ThrowbackTVDetail v1 = new ThrowbackTVDetail();
	v1.setThrowbacktvdetailid(5001);
	v1.setThrowbacktvdetailname("fauji");
	v1.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	session.save(v1);
	tx.commit();

	session.close();
	System.out.println("Many to One Annotatios Done...!!!!!!");
	factory.close();
}

public void Test_TreandingTVdetail() 
{

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	TreandingTV u=(TreandingTV)session.get(TreandingTV.class,4200);
	
	TreandingTVDetail v = new TreandingTVDetail();
	v.setTreandingtvdetailid(5100);
	v.setTreandingtvdetailname("major crime");
	v.setParent(u);
	
	TreandingTVDetail v1 = new TreandingTVDetail();
	v1.setTreandingtvdetailid(5101);
	v1.setTreandingtvdetailname("The kicks");
	v1.setParent(u);

	Transaction tx = session.beginTransaction();
	session.save(v);
	session.save(v1);
	tx.commit();

	session.close();
	System.out.println("Many to One Annotatios Done...!!!!!!");
	factory.close();
}
}
