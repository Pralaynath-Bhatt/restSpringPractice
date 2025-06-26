package com.springprac.crud.service;

import com.springprac.crud.dao.EmployeeRepository;
import com.springprac.crud.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theemployeeRepository) {
        this.employeeRepository = theemployeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int identity) {
        Optional<Employee> employee= employeeRepository.findById(identity);
        Employee theEmployee = null;
        if(employee==null){
            throw new RuntimeException("Employee not found-"+identity);
        }
        else theEmployee=employee.get();
        return theEmployee;
    }


    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(int identity) {
        employeeRepository.deleteById(identity);
    }
}
