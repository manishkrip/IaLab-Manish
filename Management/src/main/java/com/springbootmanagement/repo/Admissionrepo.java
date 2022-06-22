package com.springbootmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootmanagement.entity.Admission;

@Repository
public interface Admissionrepo extends JpaRepository<Admission, Integer> {

}
