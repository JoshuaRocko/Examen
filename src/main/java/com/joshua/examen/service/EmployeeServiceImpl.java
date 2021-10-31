package com.joshua.examen.service;

import java.util.List;

import com.joshua.examen.dao.EmployeeRepository;
import com.joshua.examen.dao.EmployeeWorkedHoursRepository;
import com.joshua.examen.model.Employee;
import com.joshua.examen.model.EmployeeWorkedHours;
import com.joshua.examen.model.requests.TotalHoursRequest;
import com.joshua.examen.utils.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployeeRepository employeeRepository;

  @Autowired
  private EmployeeWorkedHoursRepository employeeWorkedHoursRepository;

  @Override
  public List<Employee> getAllEmployees() {
    return (List<Employee>) employeeRepository.findAll();
  }

  @Override
  public Employee saveEmployee(Employee employee) {
    Employee savedEmployee = null;
    if (!Utils.isAdult(employee.getBirthdate()))
      return null;
    if (employeeRepository.nameAlreadyExists(employee.getName(), employee.getLast_name()) > 0)
      return null;
    try {
      savedEmployee = employeeRepository.save(employee);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return savedEmployee;
  }

  @Override
  public EmployeeWorkedHours saveWorkedHours(EmployeeWorkedHours workedHours) {
    EmployeeWorkedHours saverWorkedHours = null;
    if (!Utils.isValidDate(workedHours.getWorked_date()))
      return null;
    if (workedHours.getWorked_hours() > 20)
      return null;
    try {
      saverWorkedHours = employeeWorkedHoursRepository.save(workedHours);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return saverWorkedHours;
  }

  @Override
  public List<Employee> getEmployessByJob(Integer jobId) {
    return employeeRepository.findByJob_id(jobId);
  }

  @Override
  public Integer totalHoursWorked(TotalHoursRequest hoursRequest) {
    if (!Utils.isValidRangeDate(hoursRequest.getStart_date(), hoursRequest.getEnd_date()))
      return null;
    Integer hours = employeeWorkedHoursRepository.totalHoursWorked(hoursRequest.getStart_date(), hoursRequest.getEnd_date(),
        hoursRequest.getEmployee_id());
    return hours;
  }

  @Override
  public Double totalPayment(TotalHoursRequest hoursRequest)
  {
    if (!Utils.isValidRangeDate(hoursRequest.getStart_date(), hoursRequest.getEnd_date()))
      return null;
    Double payment =  employeeWorkedHoursRepository.totalPayment(hoursRequest.getStart_date(), hoursRequest.getEnd_date(),
    hoursRequest.getEmployee_id());
    return payment;
  }

}
