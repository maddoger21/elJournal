package ru.samsung.itschool.eljournal.classes.person;

public class Teacher extends Participant {
    public String Position;
    public String[] Qualification;

    public Teacher(String firstName, String secondName, String phone, int avatar, int cardID, String position, String[] qualification) {
        super(firstName, secondName, phone, avatar, cardID);
        Position = position;
        Qualification = qualification;
    }

    public String getPosition() {
        return Position;
    }

    public String[] getQualification() {
        return Qualification;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public void setQualification(String[] qualification) {
        Qualification = qualification;
    }
}
