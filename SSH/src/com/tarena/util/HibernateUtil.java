package com.tarena.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate���ڽ�ȡSession�Ĺ�����
 * @author Administrator
 *
 */
public class HibernateUtil {
	
	private static SessionFactory sf;
	
	static{
		//ʵ����Configuration
		Configuration conf = new Configuration();
		//�����������ļ�
		conf.configure("/hibernate.cfg.xml");
		sf = conf.buildSessionFactory();
	}
	public static Session getSession(){
		//����һ��Session
		Session session = sf.openSession();
		return session;
	}
}
