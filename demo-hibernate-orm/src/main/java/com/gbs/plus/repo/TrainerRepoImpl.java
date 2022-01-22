package com.gbs.plus.repo;

import com.gbs.plus.model.Trainer;
import com.gbs.plus.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TrainerRepoImpl implements TrainerRepo {

    private SessionFactory sessionFactory;
    private Session session;

    @Override
    public Trainer findById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Trainer save(Trainer entity) {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(entity);
        tx.commit();
        session.close();
        sessionFactory.close();
        return entity;
    }

    @Override
    public void delete(Trainer entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteById(Integer id) {
        // TODO Auto-generated method stub
        
    }

    
}
