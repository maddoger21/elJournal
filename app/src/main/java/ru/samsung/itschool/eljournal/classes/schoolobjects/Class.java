package ru.samsung.itschool.eljournal.classes.schoolobjects;

import ru.samsung.itschool.eljournal.classes.School;
import ru.samsung.itschool.eljournal.classes.person.Learner;
import ru.samsung.itschool.eljournal.classes.person.Teacher;

public class Class extends School {
    public String Number;
    public Teacher[] ClassTeacher;
    public Learner[] Learners;

    public void getListLearners(){};

    public void getListRelatives(){};
}
