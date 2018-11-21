package com.example.yehuda_da.secondapp;

public class Student {
    private  int profileImage;
    private String  name;
    private String age;
    private  String phoneNumber;
    private  boolean active;

    public int getProfileImage() {
        return profileImage;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean getisActive() {
        return active;
    }

    public Student(int profileImage, String name, String age, String phoneNumber, boolean active) {
        this.profileImage = profileImage;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.active = active;
    }
}
