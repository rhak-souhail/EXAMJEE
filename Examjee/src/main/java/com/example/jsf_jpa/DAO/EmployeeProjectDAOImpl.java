package com.example.jsf_jpa.DAO;

import com.example.jsf_jpa.MODELE.EmployeeProject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;

public class EmployeeProjectDAOImpl implements EmployeeProjectDAO {
    private EntityManager entityManager;

    public EmployeeProjectDAOImpl() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persis");
        entityManager = factory.createEntityManager();
    }

    @Override
    public void addEmployeeProject(EmployeeProject employeeProject) {
        entityManager.getTransaction().begin();
        entityManager.persist(employeeProject);
        entityManager.getTransaction().commit();
    }

    @Override
    public void removeEmployeeProject(EmployeeProject employeeProject) {
        entityManager.getTransaction().begin();
        entityManager.remove(employeeProject);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<EmployeeProject> getAllEmployeeProjects() {
        Query query = entityManager.createQuery("SELECT ep FROM EmployeeProject ep");
        return query.getResultList();
    }
}
