package com.manytoone.crudDemo.dao;

import com.manytoone.crudDemo.entity.Instructor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AppDAOImpl implements AppDAO{

    private EntityManager entityManager;
    @Autowired
    public AppDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Instructor theInstructor) {
        entityManager.persist(theInstructor);
    }

    @Override
    public Instructor findById(int id) {
        Instructor instructor= entityManager.find(Instructor.class,id);
        return instructor;
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Instructor instructor =findById(id);

        entityManager.remove(instructor);
    }
}
