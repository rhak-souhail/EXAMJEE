package com.example.jsf_jpa.DAO;

import com.example.jsf_jpa.MODELE.Project;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;

public class ProjectDAOImpl implements ProjectDAO {
    private EntityManager entityManager;

    public ProjectDAOImpl() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persis");
        entityManager = factory.createEntityManager();
    }

    @Override
    public void addProject(Project project) {
        entityManager.getTransaction().begin();
        entityManager.persist(project);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updateProject(Project project) {
        entityManager.getTransaction().begin();
        entityManager.merge(project);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteProject(long projectId) {
        Project project = entityManager.find(Project.class, projectId);
        entityManager.getTransaction().begin();
        entityManager.remove(project);
        entityManager.getTransaction().commit();
    }

    @Override
    public Project getProjectById(long projectId) {
        return entityManager.find(Project.class, projectId);
    }

    @Override
    public List<Project> getAllProjects() {
        Query query = entityManager.createQuery("SELECT p FROM Project p");
        return query.getResultList();
    }
}

