package com.springbootmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootmanagement.entity.Address;
@Repository
public interface Addressrepo extends JpaRepository<Address, Integer>{

}
