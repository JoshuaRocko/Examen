package com.joshua.examen.model.reponses;

import java.io.Serializable;
import java.util.List;

import com.joshua.examen.model.Employee;

public class ResponseEmployeesSucces implements Serializable
{
  private List<Employee> employees;
  private Boolean success;

  public ResponseEmployeesSucces(List<Employee> employees, Boolean success) {
    this.employees = employees;
    this.success = success;
  }

  public List<Employee> getEmployees() {
    return employees;
  }
  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }
}
