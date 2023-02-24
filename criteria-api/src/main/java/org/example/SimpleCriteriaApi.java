package org.example;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.AllArgsConstructor;
import org.example.entities.Customer;
import org.example.entities.Customer_;

import java.util.List;

@AllArgsConstructor
public class SimpleCriteriaApi {

    private final EntityManagerFactory entityManagerFactory;

    public void go() {

        // Create Session (First-Level-Chache)
        EntityManager em = entityManagerFactory.createEntityManager();

        // Um Criteria-Api nutzen zu können
        CriteriaBuilder cb = em.getCriteriaBuilder();

        // Create Query mit ZielTyp
        CriteriaQuery<String> cq = cb.createQuery(String.class);
        Root<Customer> customerRoot = cq.from(Customer.class);
        cq.select(customerRoot.get(Customer_.companyName));

        TypedQuery<String> q = em.createQuery(cq);
        List<String> allCustomers = q.getResultList();
        allCustomers.forEach(System.out::println);
        em.close();
    }
}
