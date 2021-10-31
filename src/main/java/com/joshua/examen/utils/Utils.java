package com.joshua.examen.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Utils {

  public static boolean isAdult(Date birthdate) {
    LocalDate birthdateLocalDate = dateToLocalDate(birthdate);
    LocalDate now = LocalDate.now();
    Period period = Period.between(birthdateLocalDate, now);
    System.out.println(period.getDays());
    return period.getYears() >= 18;
  }

  public static LocalDate dateToLocalDate(Date dateToConvert) {
    return dateToConvert.toInstant().atZone(ZoneId.of("America/Mexico_City")).toLocalDate();
  }

  public static boolean isValidDate(Date date) {
    return isValidRangeDate(date, new Date());
  }

  public static boolean isValidRangeDate(Date startDate, Date endDate) {
    if (startDate == null || endDate == null)
      return false;
    return endDate.after(startDate);
  }

}
