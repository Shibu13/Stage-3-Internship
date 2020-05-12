package com.cognizant.CriteriaQueryEntitySelection;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
import javax.swing.Spring;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.cognizant.CriteriaQueryEntitySelection.Utility.HibernateUtility;
import com.cognizant.CriteriaQueryEntitySelection.model.Employee;
import com.cognizant.CriteriaQueryEntitySelection.model.Laptop;

public class App {
	public static void main(String[] args) {
		try (Session session = HibernateUtility.getSessionFactory().openSession()) {
			double ramSize=8;
			CriteriaBuilder builder=session.getCriteriaBuilder();
			CriteriaQuery<Laptop> criteriaQuery=builder.createQuery(Laptop.class);
			Root<Laptop> root=criteriaQuery.from(Laptop.class);
			ParameterExpression<Double> ramSizeParameter=builder.parameter(Double.class);
			
			criteriaQuery.where(builder.equal(root.get("ramSize"), ramSizeParameter));
			
			Query<Laptop> query=session.createQuery(criteriaQuery);
			query.setParameter(ramSizeParameter,ramSize );
			
			List<Laptop> empList=query.list();
			empList.forEach(System.out::println);
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	
}
