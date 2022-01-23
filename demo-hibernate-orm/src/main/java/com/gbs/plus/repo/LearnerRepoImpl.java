package com.gbs.plus.repo;

import java.util.Optional;
import com.gbs.plus.model.Learner;
import com.gbs.plus.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class LearnerRepoImpl implements LearnerRepo {

    @Override
    public Optional<Learner> findById(Integer id) {

        return null;
    }

    @Override
    public Learner save(Learner entity) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
        }
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
