package com.sdp.model;

import java.util.ArrayList;
import java.util.List;

public class Postgraduate {
    private int id;
    private String name;
    private List<Course> courses = new ArrayList<>();

//  Constructs a postgraduate.
    public Postgraduate(int id, String name) {
        this.id = id;
        this.name = name;
    }

//  Appends a course to the postgraduate.
    public void addCourse(Course course) {
        courses.add(course);
    }

//  Returns the ID of the postgraduate.
    public int getId() {
        return id;
    }

//  Returns the name of the postgraduate.
    public String getName() {
        return name;
    }

//  Returns the courses of the postgraduate.
    public List<Course> getCourses() {
        return courses;
    }
}
