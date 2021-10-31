package com.joshua.examen.model.reponses;

import java.io.Serializable;

public class ResponseIdSuccess implements Serializable {
  private Integer id;
  private Boolean success;

  public ResponseIdSuccess(Integer id, Boolean success) {
    this.id = id;
    this.success = success;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }
}
