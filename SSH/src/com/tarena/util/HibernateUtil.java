package com.tarena.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate用于截取Session的工具类
 * @author Administrator
 *
 */
public class HibernateUtil {
	
	private static SessionFactory sf;
	
	static{
		//实例化Configuration
		Configuration conf = new Configuration();
		//加载主配置文件
		conf.configure("/hibernate.cfg.xml");
		sf = conf.buildSessionFactory();
	}
	public static Session getSession(){
		//创建一个Session
		Session session = sf.openSession();
		return session;
	}
}
