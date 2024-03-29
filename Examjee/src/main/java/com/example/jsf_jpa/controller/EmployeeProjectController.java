package com.example.jsf_jpa.controller;

import com.example.jsf_jpa.DAO.EmployeeProjectDAO;
import com.example.jsf_jpa.DAO.EmployeeProjectDAOImpl;
import com.example.jsf_jpa.MODELE.EmployeeProject;

import java.util.List;

public class EmployeeProjectController {
    private EmployeeProjectDAO employeeProjectDAO;

    public EmployeeProjectController() {
        this.employeeProjectDAO = new EmployeeProjectDAOImpl(); // Instanciation de l'implémentation de EmployeeProjectDAO
    }

    // Méthodes de contrôleur pour EmployeeProject
    public void addEmployeeProject(EmployeeProject employeeProject) {
        employeeProjectDAO.addEmployeeProject(employeeProject);
    }

    public void removeEmployeeProject(EmployeeProject employeeProject) {
        employeeProjectDAO.removeEmployeeProject(employeeProject);
    }

    public List<EmployeeProject> getAllEmployeeProjects() {
        return employeeProjectDAO.getAllEmployeeProjects();
    }
}

