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
import org.example.entities.TinyCustomer;

import java.util.List;

@AllArgsConstructor
public class MultiSelectDemo {
    private final EntityManagerFactory entityManagerFactory;

    public void go() {
        EntityManager em = entityManagerFactory.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<TinyCustomer> cq = cb.createQuery(TinyCustomer.class);
        Root<Customer> customerRoot = cq.from(Customer.class);
        cq.multiselect(customerRoot.get(Customer_.companyName),customerRoot.get(Customer_.CITY));

        TypedQuery<TinyCustomer> q = em.createQuery(cq);
        List<TinyCustomer> allCustomers = q.getResultList();
        allCustomers.forEach(System.out::println);

        em.close();

    }
}
