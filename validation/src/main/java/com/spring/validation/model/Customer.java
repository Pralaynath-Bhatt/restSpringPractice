package com.spring.validation.model;

import com.spring.validation.validator.CourseValidator;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {
    @CourseValidator(value = "LUV", message = "it should start by LUV")
    private String courseCode;
    private String firstName;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;
    @Min(value = 0,message = "Must be Greater than or equal to 0")
    @Max(value = 10, message = "Must be less than or equal to 10")
    private int freePass;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getFreePass() {
        return freePass;
    }

    public void setFreePass(int freePass) {
        this.freePass = freePass;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {
    }
}
