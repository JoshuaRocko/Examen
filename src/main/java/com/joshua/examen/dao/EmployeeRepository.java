package com.joshua.examen.dao;

import java.util.List;

import com.joshua.examen.model.Employee;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
  @Query(value = "SELECT COUNT(id) FROM employees WHERE name = :name AND last_name=:last_name", nativeQuery = true)
  Integer nameAlreadyExists(@Param("name") String name, @Param("last_name") String last_name);

  List<Employee> findByJob_id(Integer job_id);
}
