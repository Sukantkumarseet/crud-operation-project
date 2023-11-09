package com.crud.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.crud.demo.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
