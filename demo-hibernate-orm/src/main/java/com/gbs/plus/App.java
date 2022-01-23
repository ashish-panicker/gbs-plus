package com.gbs.plus;

import java.time.LocalDate;
import com.gbs.plus.model.Learner;
import com.gbs.plus.model.Trainer;
import com.gbs.plus.model.embeddable.Address;
import com.gbs.plus.model.embeddable.Name;
import com.gbs.plus.repo.LearnerRepo;
import com.gbs.plus.repo.LearnerRepoImpl;
import com.gbs.plus.repo.TrainerRepo;
import com.gbs.plus.repo.TrainerRepoImpl;
import com.gbs.plus.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Name name1 = new Name("John", "Smith");
        Name name2 = new Name("Jane", "Doe");

        Address address1 = new Address("Dawn", "123 Main St", "Anytown", "CA", "90210");
        Address address2 = new Address("Joy", "125 Main St", "Anytown", "CA", "90210");

        // Learner johnSmith = new Learner(name1, address1, "j.smith", LocalDate.now());
        Trainer trainer = new Trainer(name2, address2, "a.panicker", "FSD");

        TrainerRepo trainerRepo = new TrainerRepoImpl();
        trainerRepo.save(trainer);

        // System.out.println("Trainer: " + trainerRepo.findById(3).get());

        // trainerRepo.deleteById(3);
        // LearnerRepo learnerRepo = new LearnerRepoImpl();
        // learnerRepo.save(johnSmith);

        // HibernateUtil.shutdown();
    }
}
