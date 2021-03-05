package ru.samsung.itschool.eljournal.classes;

import ru.samsung.itschool.eljournal.classes.person.Employee;
import ru.samsung.itschool.eljournal.classes.person.Learner;
import ru.samsung.itschool.eljournal.classes.person.Participant;
import ru.samsung.itschool.eljournal.classes.person.Teacher;
import ru.samsung.itschool.eljournal.classes.schoolobjects.Class;
import ru.samsung.itschool.eljournal.classes.schoolobjects.Elective;
import ru.samsung.itschool.eljournal.classes.schoolobjects.Section;

public class School {
    public Employee[] Employee;
    public Teacher[] Teacher;
    public Learner[] Learners;
    public String Address;
    public String Name;
    public Class[] Classes;
    public Elective[] Electives;
    public Section[] Sections;

    public void getListTeachers(){};
    public void getListEmployees(){};
    public void getListLearners(){};
    public void getElectronicJournal(){};
    //public Participant getParticipant(){return };
}
