package com.gbsplus.model;

import java.time.LocalDate;

public class Reminder {

    private String reminderText;

    private LocalDate creationDate;

    public Reminder() {
        this.creationDate = LocalDate.now();
    }

    public String getReminderText() {
        return reminderText;
    }

    public void setReminderText(String reminderText) {
        this.reminderText = reminderText;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

}
