package com.div;

import com.div.enums.CardType;
import com.div.enums.ProcessingType;
import com.div.models.Card;
import com.div.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("elcan");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();


        User user = entityManager.find(User.class, 1l);
        System.out.println(user);
        System.out.println(user.getRoles());


    }
}