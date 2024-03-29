package com.example.jsf_jpa.DAO;

import com.example.jsf_jpa.MODELE.Project;

import java.util.List;

public interface ProjectDAO {
    void addProject(Project project);
    void updateProject(Project project);
    void deleteProject(long projectId);
    Project getProjectById(long projectId);
    List<Project> getAllProjects();
}

