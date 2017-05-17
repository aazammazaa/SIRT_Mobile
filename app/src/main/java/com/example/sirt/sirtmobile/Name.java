package com.example.sirt.sirtmobile;

/**
 * Created by hp on 08-May-17.
 */

public class Name {
    private String viewNumber;
    private String viewName;
    private int viewImage;
    private String semester;
    private String scheme;
    private int schemeLink;
    private int syllabusLink;
    private String syllabus;
    private String busName;
    private String busNumber;

    public Name(String semester, String scheme, int schemeLink, String syllabus, int syllabusLink) {
        this.semester = semester;
        this.scheme = scheme;
        this.schemeLink = schemeLink;
        this.syllabus = syllabus;
        this.syllabusLink = syllabusLink;
    }

    public Name(String facultyName, String facultyNumber, int facultyImage) {
        viewNumber = facultyNumber;
        viewName = facultyName;
        viewImage = facultyImage;
    }

    public Name(String busName, String busNumber) {
        this.busName = busName;
        this.busNumber = busNumber;
    }

    public String getFacultyNumber() {
        return viewNumber;
    }

    public String getFacultyName() {
        return viewName;
    }

    public int getFacultyImage() {
        return viewImage;
    }

    public String getSemester() {
        return semester;
    }

    public String getScheme() {
        return scheme;
    }

    public int getSchemeLink() {
        return schemeLink;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public int getSyllabusLink() {
        return syllabusLink;
    }

    public String getBusName() {
        return busName;
    }

    public String getBusNumber() {
        return busNumber;
    }

}
