package ru.samsung.itschool.eljournal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

import ru.samsung.itschool.eljournal.classes.person.Employee;
import ru.samsung.itschool.eljournal.classes.person.Person;

public class PersonAdapter extends ArrayAdapter<Person> {
    private LayoutInflater inflater;
    private int layout;
    private List<Person> persons;

    public PersonAdapter(Context context, int resource, List<Person> persons) {
        super(context, resource, persons);
        this.persons = persons;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        ImageView avatarView = (ImageView) view.findViewById(R.id.avatar);
        TextView numberView = (TextView) view.findViewById(R.id.number);
        TextView nameView = (TextView) view.findViewById(R.id.fullName);
        TextView phoneView = (TextView) view.findViewById(R.id.phone);

        Person person = persons.get(position);

        //Persons
        numberView.setText(Integer.toString(position));
        avatarView.setImageResource(person.getAvatar());
        nameView.setText(person.getFirstName() + " " + person.getSecondName());
        phoneView.setText(person.getPhone());

        return view;
    }
}
