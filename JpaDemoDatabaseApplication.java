package com.training.database.demodatabase;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.database.demodatabase.Entity.Person;
import com.training.database.demodatabase.Jpa.PersonJpaRepository;



@SpringBootApplication
public class JpaDemoDatabaseApplication implements CommandLineRunner {
	private Logger logger= LoggerFactory.getLogger(this.getClass());
			
	@Autowired
	PersonJpaRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("user id 10001 ->{}",repository.findById(1) );
		//logger.info("inserting 10004-> {}",repository.insert
		//		(new Person("rajesh", "chitradurga", new Date())));
		
	/*	logger.info("All users ->{}",repository.findAll() );
		logger.info("user id 10001 ->{}",repository.deletById(10002) );
		
		logger.info("updateing 10001-> {}",repository.upate
				(new Person(10001, "jeevan", "ajjampura", new Date())));*/

	}

}
