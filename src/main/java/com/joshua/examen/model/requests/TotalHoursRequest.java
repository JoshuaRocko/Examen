package com.joshua.examen.model.requests;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TotalHoursRequest {
  private Integer employee_id;

  @JsonFormat(pattern="yyyy-MM-dd")
  private Date start_date;

  @JsonFormat(pattern="yyyy-MM-dd")
  private Date end_date;

  public Integer getEmployee_id() {
    return employee_id;
  }

  public void setEmployee_id(Integer employee_id) {
    this.employee_id = employee_id;
  }

  public Date getStart_date() {
    return start_date;
  }

  public void setStart_date(Date start_date) {
    this.start_date = start_date;
  }

  public Date getEnd_date() {
    return end_date;
  }

  public void setEnd_date(Date end_date) {
    this.end_date = end_date;
  }

}
