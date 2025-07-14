package com.manytoone.crudDemo;

import com.manytoone.crudDemo.dao.AppDAO;
import com.manytoone.crudDemo.entity.Instructor;
import com.manytoone.crudDemo.entity.InstructorDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO theAppDAO){
		return runner->{
			createNewInstructor(theAppDAO);
		};
	}
	private void createNewInstructor(AppDAO theAppDAO) {
		InstructorDetail instructorDetail = new InstructorDetail("gymWithRakshi","teaching , teasing");

		Instructor instructor= new Instructor("Rakshi","Shetty","rakshishetty@gmail.com");
		instructor.setInstructorDetail(instructorDetail);
		theAppDAO.save(instructor);
		System.out.println(instructor.toString());

	}

}
