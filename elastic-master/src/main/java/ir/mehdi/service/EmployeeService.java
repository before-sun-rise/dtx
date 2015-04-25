package ir.mehdi.service;

import java.util.List;

import ir.mehdi.model.Employee;

/**
 * @author Mehdi Afsari kashi
 * @version 1.0.0
 * @since 1.0.0
 * <p/>
 * Creation Date : 2015/04/20
 */

public interface EmployeeService {
    void saveEmployee(Employee employee);
    List<Employee> findAllEmployees();
    void deleteEmployeeBySsn(String ssn);
}