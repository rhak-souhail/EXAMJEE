package com.example.jsf_jpa.DAO;

import com.example.jsf_jpa.MODELE.EmployeeProject;

import java.util.List;

public interface EmployeeProjectDAO {
    void addEmployeeProject(EmployeeProject employeeProject);
    void removeEmployeeProject(EmployeeProject employeeProject);
    List<EmployeeProject> getAllEmployeeProjects();
}

