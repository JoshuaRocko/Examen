package com.joshua.examen.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "employees")
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "gender_id")
  private Integer gender_id;

  @Column(name = "job_id")
  private Integer job_id;

  @Column(name = "name")
  private String name;

  @Column(name = "last_name")
  private String last_name;

  @Column(name = "birthdate")
  @JsonFormat(pattern="yyyy-MM-dd")
  private Date birthdate;

  @ManyToOne
  @JoinColumn(name = "job_id", insertable = false, updatable = false)
  private Job job;

  @ManyToOne
  @JoinColumn(name = "gender_id", insertable = false, updatable = false)
  private Gender gender;

  @OneToMany(mappedBy = "employee")
  private List<EmployeeWorkedHours> employeeWorkedHoursList;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getGender_id() {
    return gender_id;
  }

  public void setGender_id(Integer gender_id) {
    this.gender_id = gender_id;
  }

  public Integer getJob_id() {
    return job_id;
  }

  public void setJob_id(Integer job_id) {
    this.job_id = job_id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public Date getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
  }

  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

}
