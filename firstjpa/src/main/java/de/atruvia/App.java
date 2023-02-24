package de.atruvia;


import de.atruvia.entities.*;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.time.LocalDateTime;
import java.util.UUID;

public class App {
    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("atruvia");

    public static void main(String[] args) {

       new App().run();
    }

    private void run() {


        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutdown Hook is running !");
            entityManagerFactory.close();
        }
        ));

        //createCustomer();
        //createOrders();
        //sucheAlleKunden();
        //sucheOrdersMitKunden();
        //sucheKundenMitOrders();
        //updateKunde();
        //loescheOrder();

        personKontakt();
    }

    private void personKontakt() {

        var em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();

//        var person = Person.builder().id(UUID.randomUUID()).vorname("John").build();
//
//        person.getKontakte().add(new Kontakt("Telefon","1234"));
//        person.getKontakte().add(new Kontakt("email","a@b"));
//
//        em.persist(person);

//       var person = em.find(Person.class, UUID.fromString("99e72bfb-4a57-4432-863d-ba46e1d5b9e4"));
//
//       person.getKontakte().add(new Kontakt("web","www.dings.de"));

        TypedQuery<Person> pQuery = em.createQuery("select p from Person p inner join fetch p.kontakte k where k.art = 'web'", Person.class);

        var persons = pQuery.getResultList();

        System.out.println(persons.get(0).getKontakte());

        persons.get(0).setVorname("Peter");

        persons.get(0).getKontakte().add(new Kontakt("telefon","123"));

        em.getTransaction().commit();
        em.close();
    }

    private void loescheOrder() {
        //537ac3a6-3aad-4848-98e7-57a4c1aba83f

        var em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();

        var customer = em.find(CustomerEntity.class, UUID.fromString("537ac3a6-3aad-4848-98e7-57a4c1aba83f"));
        customer.getOrders().clear();

        em.getTransaction().commit();
        em.close();
    }

    private void updateKunde() {
        var em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();

        var customer = CustomerEntity.builder().company("Demo2").build();
        var order = OrderEntity.builder().orderdate(LocalDateTime.now()).customer(customer).build();
        customer.getOrders().add(order);

        em.persist(customer);

        em.getTransaction().commit();
        em.close();
    }


    private void sucheKundenMitOrders() {

        var em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();

        TypedQuery<CustomerEntity> customerQuery = em.createQuery("select c from CustomerEntity c left join fetch c.orders o", CustomerEntity.class);

        var customers = customerQuery.getResultList();

        customers.forEach(System.out::println);

        customers.forEach(c->{c.getOrders().forEach(System.out::println);});

        em.getTransaction().commit();
        em.close();


    }

    private void createOrders() {
        // 537ac3a6-3aad-4848-98e7-57a4c1aba83f

        var em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();

        CustomerEntity customer = em.find(CustomerEntity.class,UUID.fromString("537ac3a6-3aad-4848-98e7-57a4c1aba83f"));

        for (int i= 0; i < 3 ; i++) {
            var order = OrderEntity.builder().id(UUID.randomUUID()).customer(customer).orderdate(LocalDateTime.now()).build();
            em.persist(order);
        }

        em.getTransaction().commit();
        em.close();
    }

    private void createCustomer() {

        var em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        var customer = CustomerEntity.builder().id(UUID.randomUUID()).company("Atruvia").build();
        em.persist(customer);
        System.out.println(customer.getId());
        em.getTransaction().commit();
        em.close();
    }

    private void sucheOrdersMitKunden() {

        var em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();

        TypedQuery<OrderEntity> orderQuery = em.createQuery("from OrderEntity", OrderEntity.class);

        orderQuery.getResultList().forEach(System.out::println);

        em.getTransaction().commit();
        em.close();

    }

    private void sucheAlleKunden() {

    }
}
