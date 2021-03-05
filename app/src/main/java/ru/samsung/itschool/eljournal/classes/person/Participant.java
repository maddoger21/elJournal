package ru.samsung.itschool.eljournal.classes.person;

public class Participant extends Person {
    public int CardID;

    public Participant(String firstName, String secondName, String phone, int avatar, int cardID) {
        super(firstName, secondName, phone, avatar);
        CardID = cardID;
    }

    public int getCardID() {
        return CardID;
    }

    public void setCardID(int cardID) {
        CardID = cardID;
    }
}
