package com.training.database.demodatabase.Jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.training.database.demodatabase.Entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public Person findById(int id){
	return entityManager.find(Person.class, id);
	}

	public Person insert(Person person) {
		return entityManager.merge(person);
	}

}
