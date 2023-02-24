package org.example;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("atruvia");

    public static void main( String[] args )
    {
        new App().run();

    }

    private void run() {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutdown Hook is running !");
            entityManagerFactory.close();
        }
        ));
        //new SimpleCriteriaApi(entityManagerFactory).go();
        //new MultiSelectDemo(entityManagerFactory).go();
        //new JoinFetchDemo(entityManagerFactory).go();
        //new SubSelectDemo(entityManagerFactory).go();
        new SubSelectExistsDemo(entityManagerFactory).go();
    }
}
