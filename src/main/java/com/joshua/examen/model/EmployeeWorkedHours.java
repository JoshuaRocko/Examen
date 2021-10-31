package com.joshua.examen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

@Entity
@Table(name = "employee_worked_hours")
public class EmployeeWorkedHours {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "employee_id")
  private Integer employee_id;

  @Column(name = "worked_hours")
  private Integer worked_hours;

  @Column(name = "worked_date")
  @JsonFormat(pattern="yyyy-MM-dd")
  private Date worked_date;

  @ManyToOne
  @JoinColumn(name = "employee_id", insertable = false, updatable = false)
  private Employee employee;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getEmployee_id() {
    return employee_id;
  }

  public void setEmployee_id(Integer employee_id) {
    this.employee_id = employee_id;
  }

  public Integer getWorked_hours() {
    return worked_hours;
  }

  public void setWorked_hours(Integer worked_hours) {
    this.worked_hours = worked_hours;
  }

  public Date getWorked_date() {
    return worked_date;
  }

  public void setWorked_date(Date worked_date) {
    this.worked_date = worked_date;
  }

  

}
