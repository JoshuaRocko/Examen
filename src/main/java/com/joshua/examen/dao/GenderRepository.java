package com.joshua.examen.dao;

import com.joshua.examen.model.Gender;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRepository extends CrudRepository<Gender, Integer>
{
  
}
