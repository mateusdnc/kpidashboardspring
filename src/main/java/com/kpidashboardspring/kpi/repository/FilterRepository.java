package com.kpidashboardspring.kpi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class FilterRepository {

	@PersistenceContext
    private EntityManager em;
	

	public List<String> getCountryList() {
	   return em.createQuery("SELECT DISTINCT e.country FROM Inflation e",String.class).getResultList();
			
	}
	
}
