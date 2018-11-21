package com.sdp.model;

public class Course {
    private int id;
    private String name;


//  Constructs a course.
    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

//  Returns the ID of the course.
    public int getId() {
        return id;
    }

//  Returns the name of the course.
    public String getName() {
        return name;
    }
}
