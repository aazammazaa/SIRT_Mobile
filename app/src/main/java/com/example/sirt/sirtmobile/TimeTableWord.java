package com.example.sirt.sirtmobile;

/**
 * Created by Tanveer on 22-May-17.
 */

public class TimeTableWord {
    private static String sem = "Semester"; //Used for semester and section
    private String semester;
    private String section;

    public TimeTableWord(String semester) {
        this.semester = semester;
    }

    public TimeTableWord(String sectionWord, String section) {
        sem = sectionWord;
        this.section = section;
    }

    public String getSemester() {
        return semester;
    }

    public String getSem() {
        return sem;
    }

    public String getSection() {
        return section;
    }
}
