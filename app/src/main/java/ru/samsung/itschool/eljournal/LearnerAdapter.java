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

import ru.samsung.itschool.eljournal.classes.person.Learner;
import ru.samsung.itschool.eljournal.classes.person.Teacher;

public class LearnerAdapter extends ArrayAdapter<Learner> {
    private LayoutInflater inflater;
    private int layout;
    private List<Learner> learners;

    public LearnerAdapter(Context context, int resource, List<Learner> learners) {
        super(context, resource, learners);
        this.learners = learners;
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
        TextView groupView = (TextView) view.findViewById(R.id.group);

        Learner learner = learners.get(position);

        //Learner
        numberView.setText(Integer.toString(position));
        avatarView.setImageResource(learner.getAvatar());
        nameView.setText(learner.getFirstName() + " " + learner.getSecondName());
        phoneView.setText(learner.getPhone());
        cardView.setText("(ID: "+learner.getCardID() + ")");
        groupView.setText("Класс: " + learner.getGroup());



        return view;
    }
}
