package com.verizon.adb.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.verizon.adb.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {

	boolean existsByEmpMobile(String mobileNumber);

	boolean existsByEmpEmail(String emailId);

	Employee findByEmpMobile(String empMobile);

	Employee findByEmpEmail(String empEmail);
	
	List<Employee> findAllByEmpDept(String empDept);
	
	List<Employee> findAllByDateOfBirth(LocalDate dateOfBirth);

}
