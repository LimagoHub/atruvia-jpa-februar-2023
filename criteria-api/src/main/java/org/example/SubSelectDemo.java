package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.persistence.criteria.Subquery;
import lombok.AllArgsConstructor;
import org.example.entities.Customer;
import org.example.entities.Customer_;
import org.example.entities.Supplier;
import org.example.entities.Supplier_;

import java.util.List;

@AllArgsConstructor
public class SubSelectDemo {

    private final EntityManagerFactory entityManagerFactory;

    public void go() {
        EntityManager em = entityManagerFactory.createEntityManager();



        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Customer> cq = cb.createQuery(Customer.class);

        Subquery<String> subquery = cq.subquery(String.class);
        Root<Supplier> supplierRoot = subquery.from(Supplier.class);
        subquery.select(supplierRoot.get(Supplier_.CITY));


        Root<Customer> customerRoot = cq.from(Customer.class);

        cq.distinct(true).select(customerRoot).where(cb.in(customerRoot.get(Customer_.CITY)).value(subquery));

        TypedQuery<Customer> q = em.createQuery(cq);
        List<Customer> allCustomers = q.getResultList();
        allCustomers.forEach(System.out::println);
        em.close();

    }
}
