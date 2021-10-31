package com.joshua.examen.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ApiController {
  
  @GetMapping("")
  public String api()
  {
    return "It's alive!!";
  }
}
