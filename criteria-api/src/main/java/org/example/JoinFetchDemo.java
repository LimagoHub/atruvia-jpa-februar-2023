package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;
import lombok.AllArgsConstructor;
import org.checkerframework.checker.units.qual.C;
import org.example.entities.*;
import org.example.entities.Order;

import java.util.List;

@AllArgsConstructor
public class JoinFetchDemo {
    private final EntityManagerFactory entityManagerFactory;

    public void go() {
        EntityManager em = entityManagerFactory.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<AnzahlBestellungenJeKunde> cq = cb.createQuery(AnzahlBestellungenJeKunde.class);
        Root<Customer> customerRoot = cq.from(Customer.class);


        final Join< Customer, Order> orderRoot = customerRoot.join(Customer_.ORDERS, JoinType.LEFT);
        Expression<Long> countExpression = cb.count(orderRoot);
        cq.multiselect(
                customerRoot.get(Customer_.COMPANY_NAME),countExpression
                )
                .groupBy(customerRoot.get(Customer_.COMPANY_NAME)).orderBy(cb.desc(countExpression));
        //cq.where(cb.equal(customerRoot.get(Customer_.ORDERS).get(Order_.SHIP_COUNTRY), "USA"));
//        Predicate p = cb.equal(orderRoot.get(Order_.shipCountry), "Germany");
//        Predicate p2 = cb.equal(customerRoot.get(Customer_.city), "Berlin");
//        Predicate p3 = cb.equal(orderRoot.get(Order_.shipCountry), "Germany");
////        cq.where(p3);
//
//        Predicate pAnd = cb.conjunction();
//        pAnd = cb.and(pAnd,p2);
//        pAnd = cb.and(pAnd,p3);
//
//        Predicate pOr = cb.disjunction();
//        pOr = cb.or(pOr,p2);
//        pOr= cb.or(pOr,p3);
//
//        cq.where(cb.and(pAnd, pOr));

        TypedQuery<AnzahlBestellungenJeKunde> q = em.createQuery(cq);
        List<AnzahlBestellungenJeKunde> allCustomers = q.getResultList();
        allCustomers.forEach(System.out::println);
        em.close();



    }
}
