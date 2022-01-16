package com.gbsplus.model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ReminderDS {

    private static List<Reminder> reminders;

    static{
        reminders = new ArrayList<>();
    }

    public static List<Reminder> getReminders() {
        return reminders;
    }

    public static void addReminder(Reminder reminder) {
        reminders.add(reminder);
    }
    
}
