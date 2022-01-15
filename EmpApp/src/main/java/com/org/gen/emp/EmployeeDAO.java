package com.org.gen.emp;


import org.springframework.stereotype.Repository;
import com.org.gen.emp.Employees;
import com.org.gen.emp.Employee;
@Repository
public class EmployeeDAO {
private static Employees list = new Employees();
static {
list.getEmployeeList().add(new Employee(1,"a","b","xyz"));
list.getEmployeeList().add(new Employee(2,"p","q","sdyz"));
}
public Employees getAllEmployees() {
return list;
}
public void addEmployee(Employee employee) {
list.getEmployeeList().add(employee);
}
}

