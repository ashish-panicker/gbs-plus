package com.example;

import java.time.LocalDate;
import java.util.List;
import com.example.model.Batch;
import com.example.model.Learner;
import com.example.model.Mentor;
import com.example.repository.BatchRepositoryFileImpl;
import com.example.service.BatchService;
import com.example.service.BatchServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Learner learner1 = new Learner("John", "john", "password", "12345", "akbdjahd");
        Learner learner2 = new Learner("jayn", "jayn", "password", "565656", "akbdjahd");
        Learner learner3 = new Learner("Smith", "smith", "password", "334455", "nmhhy");

        List<Learner> learners = List.of(learner1, learner2, learner3);

        Mentor mentor1 = new Mentor("John", "john", "password", "12345", "akbdjahd", "Java");

        Batch batchJava = new Batch("Java FSD", mentor1, learners, LocalDate.of(2021, 12, 20),
                LocalDate.of(2022, 2, 20));


        BatchService batchService = new BatchServiceImpl(new BatchRepositoryFileImpl());

        Batch res = batchService.save(batchJava);

        System.out.println(res);

    }
}
