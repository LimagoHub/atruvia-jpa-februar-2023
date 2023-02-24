package com.example.second;

import com.example.second.persistence.entities.CustomerEntity;
import com.example.second.persistence.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Component
@AllArgsConstructor
@Transactional(propagation = Propagation.REQUIRED)
public class MyRunner implements CommandLineRunner {

    private final CustomerRepository repo;
    @Override
    public void run(String... args) throws Exception {
        repo.speichern(CustomerEntity.builder().id(UUID.randomUUID()).build());
    }
}
