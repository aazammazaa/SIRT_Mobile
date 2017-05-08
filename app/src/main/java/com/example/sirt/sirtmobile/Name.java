package com.example.sirt.sirtmobile;

/**
 * Created by hp on 08-May-17.
 */

public class Name {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String facultyNumber;
    private String facultyName;
    private int facultyImage = NO_IMAGE_PROVIDED;

    public Name(String facultyName, String facultyNumber, int facultyImage) {
        this.facultyNumber = facultyNumber;
        this.facultyName = facultyName;
        this.facultyImage = facultyImage;
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public int getFacultyImage() {
        return facultyImage;
    }

    public boolean hasImage() {
        return facultyImage != NO_IMAGE_PROVIDED;
    }

}
