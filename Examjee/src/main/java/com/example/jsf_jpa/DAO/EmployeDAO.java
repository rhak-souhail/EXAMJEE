package com.example.jsf_jpa.DAO;

import com.example.jsf_jpa.MODELE.Employe;

import java.util.List;

public interface EmployeDAO {
    void addEmploye(Employe employe);
    void deleteEmploye(long employeId);
    Employe getEmployeById(long employeId);
    List<Employe> getAllEmployes();
}


