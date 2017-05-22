package com.example.sirt.sirtmobile;

/**
 * Created by Vini Mishra on 08-May-17.
 */

public class MainAdapter {
    private String viewNumber;
    private String viewName;
    private int viewImage;
    private String semester;
    private String scheme;
    private String schemeLink;
    private String syllabusLink;
    private String syllabus;
    private String busName;
    private String busNumber;
    private int newsImage;
    private String newsHeadline;
    private String newsDetailed;

    public MainAdapter(String semester, String scheme, String schemeLink, String syllabus, String syllabusLink) {
        this.semester = semester;
        this.scheme = scheme;
        this.schemeLink = schemeLink;
        this.syllabus = syllabus;
        this.syllabusLink = syllabusLink;
    }

    public MainAdapter(String facultyName, String facultyNumber, int facultyImage) {
        viewNumber = facultyNumber;
        viewName = facultyName;
        viewImage = facultyImage;
    }

    public MainAdapter(String busName, String busNumber) {
        this.busName = busName;
        this.busNumber = busNumber;
    }

    public MainAdapter(int newsImage, String newsHeadline, String newsDetailed) {
        this.newsImage = newsImage;
        this.newsHeadline = newsHeadline;
        this.newsDetailed = newsDetailed;
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

    public String getSchemeLink() {
        return schemeLink;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public String getSyllabusLink() {
        return syllabusLink;
    }

    public String getBusName() {
        return busName;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public int getNewsImage() { return newsImage; }

    public String getNewsHeadline() { return newsHeadline; }

    public String getNewsDetailed() { return newsDetailed; }
}
