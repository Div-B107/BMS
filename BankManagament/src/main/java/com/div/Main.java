package com.div;

import com.div.models.Loan;
import com.div.models.User;
import com.div.properties.LoanTypes;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ali");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        User user = entityManager.find(User.class, 1L);
        user.setFin("123456");
        user.setFirstName("Ali");


        LoanTypes loanTypes = entityManager.find(LoanTypes.class, 1L);
        loanTypes.setTypeName("Gundelik telebat krediti");
        loanTypes.setDescription("scnskcsdkjscbsdkbscskcd");


        Loan loan = entityManager.find(Loan.class, 1L);
        loan.setLoanAmount(5000);
        loan.setLoanPercent(15);
        loan.setPaymentPerMonth(250);
        loan.setUser(user);
        loan.setLoanTypes(loanTypes);

        transaction.begin();
        try {
            entityManager.persist(user);
            entityManager.persist(loan);
            entityManager.persist(loanTypes);

            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }



        System.out.println(user);


    }
}