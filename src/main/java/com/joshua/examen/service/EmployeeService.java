package com.joshua.examen.service;

import java.util.List;

import com.joshua.examen.model.Employee;
import com.joshua.examen.model.EmployeeWorkedHours;
import com.joshua.examen.model.requests.TotalHoursRequest;

public interface EmployeeService {
  List<Employee> getAllEmployees();
  Employee saveEmployee(Employee employee);
  EmployeeWorkedHours saveWorkedHours(EmployeeWorkedHours workedHours);
  List<Employee> getEmployessByJob(Integer jobId);
  Integer totalHoursWorked(TotalHoursRequest hoursRequest);
  Double totalPayment(TotalHoursRequest hoursRequest);
}
