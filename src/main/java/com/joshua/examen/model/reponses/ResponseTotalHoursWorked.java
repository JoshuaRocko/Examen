package com.joshua.examen.model.reponses;

public class ResponseTotalHoursWorked {

  private Integer total_worked_hours;
  private Boolean success;

  public ResponseTotalHoursWorked(Integer total_worked_hours, Boolean success) {
    this.total_worked_hours = total_worked_hours;
    this.success = success;
  }

  public Integer getTotal_worked_hours() {
    return total_worked_hours;
  }
  public void setTotal_worked_hours(Integer total_worked_hours) {
    this.total_worked_hours = total_worked_hours;
  }
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  
}
