package com.joshua.examen.controller;

import java.util.List;

import com.joshua.examen.model.Job;
import com.joshua.examen.service.CatalogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/catalog")
public class CatalogController {

  @Autowired
  private CatalogService catalogService;

  @GetMapping("/jobs")
  public List<Job> getJobs()
  {
    return catalogService.getJobs();
  }
}
