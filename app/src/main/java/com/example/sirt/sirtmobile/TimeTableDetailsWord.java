package com.example.sirt.sirtmobile;

/**
 * Created by Tanveer on 22-May-17.
 */

public class TimeTableDetailsWord {
    private String timingFrom;
    private String timingTo;
    private String subject;
    private String faculty;

    public TimeTableDetailsWord(String timingFrom, String timingTo, String subject, String faculty) {
        this.timingFrom = timingFrom;
        this.timingTo = timingTo;
        this.subject = subject;
        this.faculty = faculty;

    }

    public String getTimingFrom() {
        return timingFrom;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getSubject() {
        return subject;
    }

    public String getTimingTo() {
        return timingTo;
    }
}
