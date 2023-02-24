package com.example.second.persistence.repository;

import com.example.second.persistence.entities.CustomerEntity;

public interface MyCustomerRepository {

    void speichern(CustomerEntity entity);
}
