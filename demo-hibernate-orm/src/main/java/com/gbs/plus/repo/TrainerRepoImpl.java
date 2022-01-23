package com.gbs.plus.repo;

import java.util.Optional;
import com.gbs.plus.model.Trainer;
import com.gbs.plus.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrainerRepoImpl implements TrainerRepo {
    
    Logger logger = LoggerFactory.getLogger(TrainerRepoImpl.class);

    @Override
    public Optional<Trainer> findById(Integer id) {
        Trainer trainer = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            trainer = session.get(Trainer.class, id);
            transaction.commit();
        }
        return Optional.ofNullable(trainer);
    }

    @Override
    public Trainer save(Trainer entity) {
        System.out.println("before logging");
        logger.info("TrainerRepoImpl.save()");
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            logger.debug( "TrainerRepoImpl.save()", "openSession");
            Transaction transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
        }
        return entity;
    }

    @Override
    public void delete(Trainer entity) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(entity);
            transaction.commit();
        }
    }

    @Override
    public void deleteById(Integer id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Trainer trainer = findById(id).orElseThrow();
            session.delete(trainer);
            transaction.commit();
        }
    }
}
