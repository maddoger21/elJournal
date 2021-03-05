package ru.samsung.itschool.eljournal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import ru.samsung.itschool.eljournal.classes.person.Employee;
import ru.samsung.itschool.eljournal.classes.person.Learner;
import ru.samsung.itschool.eljournal.classes.person.Person;
import ru.samsung.itschool.eljournal.classes.person.Teacher;

public class PageFragment extends Fragment {
    public ArrayList<Person> persons = new ArrayList();
    public ArrayList<Employee> employees = new ArrayList();
    public ArrayList<Teacher> teachers = new ArrayList();
    public ArrayList<Learner> learners = new ArrayList();
    ListView list;
    private int pageNumber;

    public static PageFragment newInstance(int page) {
        PageFragment fragment = new PageFragment();
        Bundle args=new Bundle();
        //задаем количество страниц из MyAdapter
        args.putInt("num", page);
        fragment.setArguments(args);
        return fragment;
    }

    public PageFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //получаем номер вкоадки
        pageNumber = getArguments() != null ? getArguments().getInt("num") : 1;
    }

    //Отображение фрагментов(вкладок)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View result=inflater.inflate(R.layout.fragment_page, container, false);
        setInitialDataLearners();
        setInitialDataEmployees();
        setInitialDataTeachers();
        switch (pageNumber) {

            // Вкладка - Персоны
            case 0:
                // получаем элемент ListView
                list = (ListView) result.findViewById(R.id.list);
                // создаем адаптер
                PersonAdapter stateAdapterPerson = new PersonAdapter(result.getContext(), R.layout.list_item_person, persons);
                // устанавливаем адаптер
                list.setAdapter(stateAdapterPerson);
                for (int i = 0; i < learners.size(); i++) {
                    persons.add(new Person(learners.get(i).getFirstName(), learners.get(i).getSecondName(), learners.get(i).getPhone(), learners.get(i).getAvatar()));
                }
                for (int i = 0; i < employees.size(); i++) {
                    persons.add(new Person(employees.get(i).getFirstName(), employees.get(i).getSecondName(), employees.get(i).getPhone(), employees.get(i).getAvatar()));
                }
                for (int i = 0; i < teachers.size(); i++) {
                    persons.add(new Person(teachers.get(i).getFirstName(), teachers.get(i).getSecondName(), teachers.get(i).getPhone(), teachers.get(i).getAvatar()));
                }
                break;
            // Вкладка - Работники
            case 1:
                // получаем элемент ListView
                list = (ListView) result.findViewById(R.id.list);
                // создаем адаптер
                EmployeeAdapter stateAdapterEmployee = new EmployeeAdapter(result.getContext(), R.layout.list_item_employee, employees);
                // устанавливаем адаптер
                list.setAdapter(stateAdapterEmployee);

                break;
            // Вкладка - Учителя
            case 2:
                // получаем элемент ListView
                list = (ListView) result.findViewById(R.id.list);
                // создаем адаптер
                TeacherAdapter stateAdapterTeacher = new TeacherAdapter(result.getContext(), R.layout.list_item_teacher, teachers);
                // устанавливаем адаптер
                list.setAdapter(stateAdapterTeacher);
                break;
            // Вкладка - Ученики
            case 3:
                // получаем элемент ListView
                list = (ListView) result.findViewById(R.id.list);
                // создаем адаптер
                LearnerAdapter stateAdapterLearner = new LearnerAdapter(result.getContext(), R.layout.list_item_learner, learners);
                // устанавливаем адаптер
                list.setAdapter(stateAdapterLearner);
                break;
        }
        return result;
    }
    //начальные данные для Работников
    private void setInitialDataEmployees(){

        employees.add(new Employee("Яша", "Лававов", "89347504832", R.drawable.male, 1, "Дворник"));
        employees.add(new Employee("Наталья", "Черноталова", "89840694853", R.drawable.female, 2, "Медсестра"));
        employees.add(new Employee("Галина", "Иванова", "89587494176", R.drawable.female, 3, "Уборщица"));
        employees.add(new Employee("Петр", "Максимов", "89750593866", R.drawable.male, 4, "Охраник"));
        employees.add(new Employee("Александр", "Македонский", "89124443234", R.drawable.male, 5, "Охраник"));

    }
    //начальные данные для Учеников
    private void setInitialDataLearners(){

        learners.add(new Learner ("Влад", "Пономарев","89370204123", R.drawable.male, 11, "3G"));
        learners.add(new Learner ("Дима", "Калечкин","89232131231", R.drawable.male, 12, "4A"));
        learners.add(new Learner ("Ольга", "Симонова","89321233122", R.drawable.female, 13, "9B"));
        learners.add(new Learner ("Сергей", "Размаринов","89213112339", R.drawable.male, 14, "1B"));
        learners.add(new Learner ("Алла", "Пугачева","89320134562", R.drawable.female, 15, "5V"));
    }
    //начальные данные для Учителей
    private void setInitialDataTeachers(){

        teachers.add(new Teacher("Сара", "Джонс" , "89560112567", R.drawable.female, 6,"Учитель Английского языка",new String[] {"Лингвист", "Педагог"}));
        teachers.add(new Teacher("Ирина", "Штормова" , "89439405444", R.drawable.female, 7,"Учитель Русского языка",new String[] {"Лингвист", "Педагог"}));
        teachers.add(new Teacher("Лариса", "Гудеева" , "89112940332", R.drawable.female, 8,"Учитель Физики",new String[] {"Физик", "Математик", "Педагог"}));
        teachers.add(new Teacher("Констанин", "Улиткин" , "88005553535", R.drawable.male, 9,"Учитель Математики",new String[] {"Математик", "Педагог"}));
        teachers.add(new Teacher("Ричард", "Чиркин" , "89439405444", R.drawable.male, 10,"Учитель Информатики",new String[] { "Педагог", "Математик", "Физик", "Информатик"}));

    }
}
