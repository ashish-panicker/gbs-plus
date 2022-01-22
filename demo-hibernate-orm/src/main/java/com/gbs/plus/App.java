package com.gbs.plus;

import java.time.LocalDate;
import com.gbs.plus.model.Learner;
import com.gbs.plus.model.Trainer;
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

        Learner johnSmith = new Learner("John", "Smith", "j.smith", LocalDate.now());
        Learner janeDoe = new Learner("Jane", "Doe", "j.doe", LocalDate.of(2021, 11, 15));
        Trainer trainer = new Trainer("Ashish", "Panicker", "a.panicker", "FSD");

        TrainerRepo trainerRepo = new TrainerRepoImpl();
        trainerRepo.save(trainer);

        LearnerRepo learnerRepo = new LearnerRepoImpl();
        learnerRepo.save(johnSmith);
        learnerRepo.save(janeDoe);

        HibernateUtil.shutdown();
    }
}
