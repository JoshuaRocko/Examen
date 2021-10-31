package com.joshua.examen.model.reponses;

import java.io.Serializable;

public class ResponseTotalPayment implements Serializable
{
  private Double payment;
  private Boolean succes;
  
  public ResponseTotalPayment(Double payment, Boolean succes) {
    this.payment = payment;
    this.succes = succes;
  }

  public Double getPayment() {
    return payment;
  }

  public void setPayment(Double payment) {
    this.payment = payment;
  }

  public Boolean getSucces() {
    return succes;
  }

  public void setSucces(Boolean succes) {
    this.succes = succes;
  }
}
