package com.example.service;
import java.util.List;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 

import com.example.dao.EmployeeDao;
import com.example.model.Employee;

 

@Service
public class EmployeeSerivce_Class implements EmployeeService {
    @Autowired
    private EmployeeDao empdao;

 

    @Override
    public List<Employee> findAll() {
        // TODO Auto-generated method stub
        return empdao.findAll();
    }

 

    @Override
    public void save(Employee theEmployee) {
        // TODO Auto-generated method stub
        empdao.save(theEmployee);
    }

 

    @Override
    public void deleteById(Long theId) {
        empdao.deleteById(theId);

 

    }

 

}
