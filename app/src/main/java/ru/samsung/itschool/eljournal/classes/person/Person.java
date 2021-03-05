package ru.samsung.itschool.eljournal.classes.person;

public class Person {
    private String firstName;
    private String secondName;
    private String phone;
    private int avatar;

    public Person(String firstName, String secondName, String phone, int avatar) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.phone = phone;
        this.avatar = avatar;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAvatar() {
        return avatar;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPhone() {
        return phone;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
