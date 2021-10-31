package com.joshua.examen.controller;

import java.util.List;

import com.joshua.examen.model.Employee;
import com.joshua.examen.model.EmployeeWorkedHours;
import com.joshua.examen.model.reponses.ResponseEmployeesSucces;
import com.joshua.examen.model.reponses.ResponseIdSuccess;
import com.joshua.examen.model.reponses.ResponseTotalHoursWorked;
import com.joshua.examen.model.reponses.ResponseTotalPayment;
import com.joshua.examen.model.requests.TotalHoursRequest;
import com.joshua.examen.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/employee")
public class EmployeeController 
{
  @Autowired
  private EmployeeService employeeService;

  @GetMapping("")
  public List<Employee> getAllEmployees()
  {
    return employeeService.getAllEmployees();
  }

  @PostMapping("")
  public ResponseIdSuccess saveEmployee(@RequestBody Employee employee)
  {
    Employee savedEmployee = employeeService.saveEmployee(employee);
    if(savedEmployee != null) return new ResponseIdSuccess(savedEmployee.getId(), true);
    return new ResponseIdSuccess(null, false);
  }

  @PostMapping("/worked-hours")
  public ResponseIdSuccess saveWorkedHours(@RequestBody EmployeeWorkedHours workedHours)
  {
    EmployeeWorkedHours savedWorkedHours = employeeService.saveWorkedHours(workedHours);
    if(savedWorkedHours != null) return new ResponseIdSuccess(savedWorkedHours.getId(), true);
    return new ResponseIdSuccess(null, false);
  }

  @GetMapping("/job")
  public ResponseEmployeesSucces getEmployessByJob(@RequestBody Employee request)
  {
    List<Employee> employees = employeeService.getEmployessByJob(request.getJob_id());
    if(employees.size() > 0) return new ResponseEmployeesSucces(employees, true);
    return new ResponseEmployeesSucces(employees, false);
  }

  @GetMapping("/total-worked-hours")
  public ResponseTotalHoursWorked totalHoursWorked(@RequestBody TotalHoursRequest totalHoursRequest)
  {
    Integer hours = employeeService.totalHoursWorked(totalHoursRequest);
    if(hours != null) return new ResponseTotalHoursWorked(hours, true);
    return new ResponseTotalHoursWorked(null, false);
  }

  @GetMapping("/payment")
  public ResponseTotalPayment totalPayment(@RequestBody TotalHoursRequest totalHoursRequest)
  {
    Double payment = employeeService.totalPayment(totalHoursRequest);
    if(payment != null) return new ResponseTotalPayment(payment, true);
    return new ResponseTotalPayment(null, false);
  }

}
