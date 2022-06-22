package com.springbootmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootmanagement.entity.Student;

@Repository
public interface Studentrepo extends JpaRepository<Student,Integer> {

}
