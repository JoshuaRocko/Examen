package com.joshua.examen.dao;

import java.util.Date;

import com.joshua.examen.model.EmployeeWorkedHours;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeWorkedHoursRepository extends CrudRepository<EmployeeWorkedHours, Integer> {
  @Query(value = "SELECT SUM(worked_hours) FROM employee_worked_hours WHERE worked_date BETWEEN :start_date AND :end_date AND employee_id = :employee_id", nativeQuery = true)
  Integer totalHoursWorked(@Param("start_date") Date start_date, @Param("end_date") Date end_date,
      @Param("employee_id") Integer employee_id);

  @Query(value = "select (workedHours.total_hours) * j.salary from jobs j, employees e, (select SUM(ewh.worked_hours) as total_hours from examen.employee_worked_hours ewh where worked_date between :start_date and :end_date and employee_id = :employee_id) as workedHours where e.job_id = j.id  and e.id = :employee_id", nativeQuery = true)
  Double totalPayment(@Param("start_date") Date start_date, @Param("end_date") Date end_date,
      @Param("employee_id") Integer employee_id);
}
