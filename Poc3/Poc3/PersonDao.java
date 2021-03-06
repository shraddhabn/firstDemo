package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Person;

@Repository
public interface PersonDao extends JpaRepository<Person,Integer> {

}