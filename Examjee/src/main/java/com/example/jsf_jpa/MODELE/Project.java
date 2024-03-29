package com.example.jsf_jpa.MODELE;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Projet")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double budget;

    @ManyToMany(mappedBy = "Project")
    private Set<Employe> employes = new HashSet<>();

    // Constructors
    public Project() {
    }

    public Project(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Set<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(Set<Employe> employes) {
        this.employes = employes;
    }

    public void addEmploye(Employe employe) {
        this.employes.add(employe);
        employe.getProjects().add(this);
    }

    public void removeEmploye(Employe employe) {
        this.employes.remove(employe);
        employe.getProjects().remove(this);
    }
}

