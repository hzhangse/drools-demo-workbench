package com.drools.facts;

public class Course {
    public Course() {
    	
    }
    public Course(String course) {
        super();
        this.course = course;
    }

    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

}
