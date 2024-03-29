package com.example.jsf_jpa.controller;

import com.example.jsf_jpa.DAO.ProjectDAO;
import com.example.jsf_jpa.DAO.ProjectDAOImpl;
import com.example.jsf_jpa.MODELE.Project;

import java.util.List;

public class ProjectController {
    private ProjectDAO projectDAO;

    public ProjectController() {
        this.projectDAO = new ProjectDAOImpl(); // Instanciation de l'implémentation de ProjectDAO
    }

    // Méthodes de contrôleur pour Project
    public void addProject(Project project) {
        projectDAO.addProject(project);
    }

    public void updateProject(Project project) {
        projectDAO.updateProject(project);
    }

    public void deleteProject(long projectId) {
        projectDAO.deleteProject(projectId);
    }

    public Project getProjectById(long projectId) {
        return projectDAO.getProjectById(projectId);
    }

    public List<Project> getAllProjects() {
        return projectDAO.getAllProjects();
    }
}
