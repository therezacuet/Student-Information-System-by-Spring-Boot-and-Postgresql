package com.thereza.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thereza.domain.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
