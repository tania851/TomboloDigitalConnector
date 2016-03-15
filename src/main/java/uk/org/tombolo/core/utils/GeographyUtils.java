package uk.org.tombolo.core.utils;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import uk.org.tombolo.core.Geography;

public class GeographyUtils {

	static Session session = HibernateUtil.getSessionFactory().openSession();

	public static Geography getGeographyByLabel(String label){
		Criteria criteria = session.createCriteria(Geography.class);
		return (Geography)criteria.add(Restrictions.eq("label", label)).uniqueResult();		
	}
	
	public static Geography getTestGeography(){
		Criteria criteria = session.createCriteria(Geography.class);
		return (Geography)criteria.add(Restrictions.eq("label", "E01000001")).uniqueResult();
	}
}