package ru.samsung.itschool.eljournal.classes.person;

public class Employee extends Participant{
    public String Position;

    public Employee(String firstName, String secondName, String phone, int avatar, int cardID, String position) {
        super(firstName, secondName, phone, avatar, cardID);
        Position = position;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }
}
