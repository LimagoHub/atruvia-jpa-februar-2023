package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;
import lombok.AllArgsConstructor;
import org.example.entities.Customer;
import org.example.entities.Customer_;
import org.example.entities.Order;

import java.util.List;

@AllArgsConstructor
public class JoinDemo {
    private final EntityManagerFactory entityManagerFactory;

    public void go() {
        EntityManager em = entityManagerFactory.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Customer> cq = cb.createQuery(Customer.class);
        Root<Customer> customerRoot = cq.from(Customer.class);


        Join<Customer,Order> orderRoot = customerRoot.join(Customer_.ORDERS);

        cq.select(customerRoot);

        TypedQuery<Customer> q = em.createQuery(cq);
        List<Customer> allCustomers = q.getResultList();
        allCustomers.forEach(System.out::println);
        em.close();

    }
}
