package com.gbs.plus.repo;

import com.gbs.plus.model.Learner;
import com.gbs.plus.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LearnerRepoImpl implements LearnerRepo {

    private SessionFactory sessionFactory;
    private Session session;

    @Override
    public Learner findById(Integer id) {
        
        return null;
    }

    @Override
    public Learner save(Learner entity) {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction tx =  session.beginTransaction();
        session.save(entity);
        tx.commit();
        session.close();
        sessionFactory.close();
        return entity;
    }

    @Override
    public void delete(Learner entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteById(Integer id) {
        // TODO Auto-generated method stub
        
    }
    
}
