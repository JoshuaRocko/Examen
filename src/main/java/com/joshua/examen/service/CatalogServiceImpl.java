package com.joshua.examen.service;

import java.util.List;

import com.joshua.examen.dao.JobRepository;
import com.joshua.examen.model.Job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl implements CatalogService
{
  @Autowired
  private JobRepository jobRepository;

  @Override
  public List<Job> getJobs()
  {
    return (List<Job>)jobRepository.findAll();
  }
}
