package com.jpa.example.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepoForEmpdet {
	@Autowired
	private EntityManager entityManager;
	
	@Transactional
	public void save(Employeedetails employee) {
		entityManager.persist(employee);
	}
	public List<Employeedetails> findAll(){
		String query = "SELECT e FROM Employeedetails e";
		TypedQuery<Employeedetails> queries=entityManager.createQuery(query,Employeedetails.class);
		return queries.getResultList();
	}
	public Employeedetails findById(Integer id) {
		return entityManager.find(Employeedetails.class,id);	
	}
	@Transactional
    public Employeedetails update(Employeedetails employee) {
    	return entityManager.merge(employee);
    }
	@Transactional
	public void delete(Integer id) {
		Employeedetails employee=entityManager.find(Employeedetails.class,id);
		entityManager.remove(employee);
	}


}
