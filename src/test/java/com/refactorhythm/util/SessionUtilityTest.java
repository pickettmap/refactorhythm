package com.refactorhythm.util;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

public class SessionUtilityTest {

    @Test
    public void getSessionFactoryTest(){
        SessionFactory factory = SessionUtility.INSTANCE.getSessionFactoryInstance();
    }

    @Test
    public void getSessionTest(){
        Session session = SessionUtility.INSTANCE.getSessionFactoryInstance().openSession();
    }

    @Test
    public void getSessionTransactionTest(){
        Transaction transaction = SessionUtility.INSTANCE.getSessionFactoryInstance()
                .openSession().getTransaction();
    }

    @Test
    public void beginSessionTransactionTest(){
        Transaction transaction = SessionUtility.INSTANCE.getSessionFactoryInstance()
                .openSession().beginTransaction();
    }
}
