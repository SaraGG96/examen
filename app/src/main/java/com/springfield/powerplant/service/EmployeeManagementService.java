package com.springfield.powerplant.service;
import com.springfield.powerplant.model.Department;
import com.springfield.powerplant.model.Employee;
import com.springfield.powerplant.model.ExperienceLevel;
import com.springfield.powerplant.model.Shift;

public class EmployeeManagementService {

    public Employee createEmployee(String name, int id, Department department, ExperienceLevel experienceLevel, Shift shift) {
        Employee employee = new Employee(name, id, department, experienceLevel, shift);
        employee.setName(name);
        employee.setId(id);
        employee.setDepartment(department);
        employee.setExperienceLevel(experienceLevel);
        employee.setShift(shift);
        return employee;
    }
    
}
