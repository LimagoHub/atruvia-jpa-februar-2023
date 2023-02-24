package com.example.second.persistence.repository;

import com.example.second.persistence.entities.CustomerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CustomerRepository extends CrudRepository<CustomerEntity, UUID> {

    Iterable<CustomerEntity> findByVorname(String vorname);

    @Query("update CustomerEntity c set c.company = :name")
    void xyz(UUID id, String name);
}
