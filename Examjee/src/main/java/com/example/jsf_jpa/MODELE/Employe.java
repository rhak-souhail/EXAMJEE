package com.example.jsf_jpa.MODELE;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "Employe")
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String skill;

    @OneToMany(mappedBy = "Employe")
    private Set<EmployeeProject> employeeProjects = new HashSet<>();

    // Constructors
    public Employe() {
    }

    public Employe(String name, String email, String skill) {
        this.name = name;
        this.email = email;
        this.skill = skill;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Set<EmployeeProject> getEmployeeProjects() {
        return employeeProjects;
    }

    public void setEmployeeProjects(Set<EmployeeProject> employeeProjects) {
        this.employeeProjects = employeeProjects;
    }

    public void addEmployeeProject(EmployeeProject employeeProject) {
        this.employeeProjects.add(employeeProject);
        employeeProject.setEmploye(this);
    }

    public void removeEmployeeProject(EmployeeProject employeeProject) {
        this.employeeProjects.remove(employeeProject);
        employeeProject.setEmploye(null);
    }

    public <Projet> List<Projet> getProjects() {
        List<Projet> projects = new ArrayList<>();
        for (EmployeeProject employeeProject : this.employeeProjects) {
            projects.add((Projet) employeeProject.getProject());
        }
        return projects;
    }

}

