package com.crud.demo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crud.demo.entities.Student;
import com.crud.demo.repository.StudentRepository;

@SpringBootTest
class CrudprojectApplicationTests {

	@Autowired
	private StudentRepository StudentRepo;
	
	
	@Test
	void saveoneStudent() {
	Student s = new Student();
	s.setName("sukant");
	s.setCourse("fullstack development");
	s.setFee(23000);
	StudentRepo.save(s);
	
	@Test
	void savetwoStudent() {
	Student s = new Student();
	s.setName("stallin");
	s.setCourse("testing and  development");
	s.setFee(10000);
	StudentRepo.save(s);
	}
   @Test
	void deletetwoStudent() {
		StudentRepo.deleteById(1l);
	}
	@Test
	void updateonestudent() {
		Student s = new Student();
		s.setId(2l);
		s.setCourse("csa");
		s.setName("mike");
		s.setFee(5000);
		StudentRepo.save(s);
	}
	@Test
	void getonestudent() {
		Optional<Student> findById = StudentRepo.findById(4l);
		Student s = findById.get();
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getCourse());
		System.out.println(s.getFee());
		
	}

	


}
