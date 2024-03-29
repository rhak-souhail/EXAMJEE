package com.example.jsf_jpa.controller;

import com.example.jsf_jpa.DAO.EmployeDAO;
import com.example.jsf_jpa.DAO.EmployeDAOImpl;
import com.example.jsf_jpa.MODELE.Employe;

import java.util.List;

public class EmployeController {
    private EmployeDAO employeDAO;

    public EmployeController() {
        this.employeDAO = new EmployeDAOImpl(); // Instanciation de l'implémentation de EmployeDAO
    }

    // Méthodes de contrôleur pour Employe
    public void addEmploye(Employe employe) {
        employeDAO.addEmploye(employe);
    }



    public void deleteEmploye(long employeId) {
        employeDAO.deleteEmploye(employeId);
    }

    public Employe getEmployeById(long employeId) {
        return employeDAO.getEmployeById(employeId);
    }

    public List<Employe> getAllEmployes() {
        return employeDAO.getAllEmployes();
    }
}
