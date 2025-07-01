package com.spring.thymeleaf.model;
public class Student {
    private String firstName;

    private String lastName;

    private String country;

    private String favoriteProgramingLanguage;
    private String favoriteOPSystem;

    public String getFavoriteOPSystem() {
        return favoriteOPSystem;
    }

    public void setFavoriteOPSystem(String favoriteOPSystem) {
        this.favoriteOPSystem = favoriteOPSystem;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavoriteProgramingLanguage() {
        return favoriteProgramingLanguage;
    }

    public void setFavoriteProgramingLanguage(String favoriteProgramingLanguage) {
        this.favoriteProgramingLanguage = favoriteProgramingLanguage;
    }

    public Student(String firstName, String lastName, String country, String favoriteProgramingLanguage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.favoriteProgramingLanguage = favoriteProgramingLanguage;
    }

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
