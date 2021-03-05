package ru.samsung.itschool.eljournal.classes.person;

public class Relatives extends Person{
    String relate;

    public Relatives(String firstName, String secondName, String phone, int avatar, String relate) {
        super(firstName, secondName, phone, avatar);
        this.relate = relate;
    }

    public String getRelate() {
        return relate;
    }

    public void setRelate(String relate) {
        this.relate = relate;
    }

}
