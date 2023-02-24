package com.example.second.persistence.repository;

import com.example.second.persistence.entities.CustomerEntity;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class MyCustomerImpl implements MyCustomerRepository{

    @Autowired
    private EntityManager em;
    @Override
    public void speichern(CustomerEntity entity) {
        em.persist(entity);
    }
}
