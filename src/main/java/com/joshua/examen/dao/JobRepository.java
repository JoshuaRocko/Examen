package com.joshua.examen.dao;

import com.joshua.examen.model.Job;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends CrudRepository<Job, Integer>
{
  
}
