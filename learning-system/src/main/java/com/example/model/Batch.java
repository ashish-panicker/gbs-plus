package com.example.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Batch implements Serializable{

    private String name;
    private Mentor mentor;
    private List<Learner> learners;
    private LocalDate starttDate;
    private LocalDate endDate;
    private String status;

    public Batch() {}

    public Batch(String name, Mentor mentor, List<Learner> learners, LocalDate starttDate, LocalDate endDate) {
        this.name = name;
        this.mentor = mentor;
        this.learners = learners;
        this.starttDate = starttDate;
        this.endDate = endDate;
        this.status = "Planned";
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public List<Learner> getLearners() {
        return learners;
    }

    public void setLearners(List<Learner> learners) {
        this.learners = learners;
    }

    public LocalDate getStarttDate() {
        return starttDate;
    }

    public void setStarttDate(LocalDate starttDate) {
        this.starttDate = starttDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "name='" + name + '\'' +
                ", mentor=" + mentor +
                ", learners=" + learners +
                ", starttDate=" + starttDate +
                ", endDate=" + endDate +
                ", status='" + status + '\'' +
                '}';
    }
}
