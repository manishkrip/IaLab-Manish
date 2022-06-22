package com.springbootmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootmanagement.entity.Teacher;

@Repository
public interface Teacherrepo extends JpaRepository<Teacher, Integer> {

}
