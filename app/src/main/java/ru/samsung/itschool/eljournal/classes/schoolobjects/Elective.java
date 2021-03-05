package ru.samsung.itschool.eljournal.classes.schoolobjects;

import ru.samsung.itschool.eljournal.classes.School;
import ru.samsung.itschool.eljournal.classes.person.Learner;
import ru.samsung.itschool.eljournal.classes.person.Teacher;

public class Elective extends School {
    public String AcademicSubject;
    public Learner[] Learners;
    public Teacher ClassTeacher;

    public void getList(){};
    public void getListRelatives(){};
}
