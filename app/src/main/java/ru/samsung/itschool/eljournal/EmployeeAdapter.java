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

public class EmployeeAdapter extends ArrayAdapter<Employee> {
    private LayoutInflater inflater;
    private int layout;
    private List<Employee> employees;

    public EmployeeAdapter(Context context, int resource, List<Employee> employees) {
        super(context, resource, employees);
        this.employees = employees;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        TextView cardView = (TextView) view.findViewById(R.id.cardID);
        ImageView avatarView = (ImageView) view.findViewById(R.id.avatar);
        TextView numberView = (TextView) view.findViewById(R.id.number);
        TextView nameView = (TextView) view.findViewById(R.id.fullName);
        TextView phoneView = (TextView) view.findViewById(R.id.phone);
        TextView positionView = (TextView) view.findViewById(R.id.position);

        Employee employee = employees.get(position);

        //Employees
        numberView.setText(Integer.toString(position));
        avatarView.setImageResource(employee.getAvatar());
        nameView.setText(employee.getFirstName() + " " + employee.getSecondName());
        phoneView.setText(employee.getPhone());
        cardView.setText("(ID: "+employee.getCardID() + ")");
        positionView.setText(employee.getPosition());


        return view;
    }
}
