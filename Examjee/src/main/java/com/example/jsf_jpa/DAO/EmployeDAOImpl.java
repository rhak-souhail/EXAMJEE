package com.example.jsf_jpa.DAO;

import com.example.jsf_jpa.MODELE.Employe;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;

public class EmployeDAOImpl implements EmployeDAO {
    private EntityManager entityManager;

    public EmployeDAOImpl() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persis");
        entityManager = factory.createEntityManager();
    }

    @Override
    public void addEmploye(Employe employe) {
        entityManager.getTransaction().begin();
        entityManager.persist(employe);
        entityManager.getTransaction().commit();
    }


    @Override
    public void deleteEmploye(long employeId) {
        Employe employe = entityManager.find(Employe.class, employeId);
        entityManager.getTransaction().begin();
        entityManager.remove(employe);
        entityManager.getTransaction().commit();
    }

    @Override
    public Employe getEmployeById(long employeId) {
        return entityManager.find(Employe.class, employeId);
    }

    @Override
    public List<Employe> getAllEmployes() {
        Query query = entityManager.createQuery("SELECT e FROM Employe e");
        return query.getResultList();
    }
}
