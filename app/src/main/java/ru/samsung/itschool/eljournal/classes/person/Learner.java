package ru.samsung.itschool.eljournal.classes.person;

import androidx.annotation.NonNull;

public class Learner extends Participant {
//    public Relatives[] Relatives;
    private String group;

    public Learner(String firstName, String secondName, String phone, int avatar, int cardID, String group) {
        super(firstName, secondName, phone, avatar, cardID);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    //
//    public Relatives[] getRelatives() {
//        return Relatives;
//    }
}
