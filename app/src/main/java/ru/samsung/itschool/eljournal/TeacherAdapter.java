package ru.samsung.itschool.eljournal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

import ru.samsung.itschool.eljournal.classes.person.Employee;
import ru.samsung.itschool.eljournal.classes.person.Teacher;

public class TeacherAdapter extends ArrayAdapter<Teacher> {
    private LayoutInflater inflater;
    private int layout;
    private List<Teacher> teachers;

    public TeacherAdapter(Context context, int resource, List<Teacher> teachers) {
        super(context, resource, teachers);
        this.teachers = teachers;
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
        TextView qualView = (TextView) view.findViewById(R.id.qual);

        Teacher teacher = teachers.get(position);

        //Teacher
        numberView.setText(Integer.toString(position));
        avatarView.setImageResource(teacher.getAvatar());
        nameView.setText(teacher.getFirstName() + " " + teacher.getSecondName());
        phoneView.setText(teacher.getPhone());
        cardView.setText("(ID: "+teacher.getCardID() + ")");
        positionView.setText(teacher.getPosition());
        qualView.setText("Квалификация: " + Arrays.toString(teacher.getQualification()));


        return view;
    }
}
