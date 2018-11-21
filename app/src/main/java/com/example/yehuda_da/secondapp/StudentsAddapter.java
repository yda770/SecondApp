package com.example.yehuda_da.secondapp;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.example.yehuda_da.secondapp.R;

import java.util.List;

public class StudentsAddapter extends BaseAdapter {

    List<Student> students;
    private class ViewHolder{
        public TextView tvName;
        public TextView tvAge;
        public TextView tvPhone;
        public ImageView imgProfile;
        public Switch sActive;

    }

    public StudentsAddapter(List<Student> students) {
        this.students = students;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_student_item, parent, false);

//            ViewHolder viewHolder = new ViewHolder();
//            convertView.setTag(viewHolder);

        }
        Student student = students.get(position);
//        ViewHolder curr = (ViewHolder) convertView.getTag();

        //curr.imgProfile = convertView.findViewById(R.id.i);

        TextView tvName = convertView.findViewById(R.id.tvName);
        tvName.setText(student.getName());

        TextView tvAge = convertView.findViewById(R.id.tvAge);

        tvAge.setText(student.getAge());
        TextView tvPhone = convertView.findViewById(R.id.tvPhone);
        tvPhone.setText(student.getPhoneNumber());

        Switch sActive = convertView.findViewById(R.id.sActive);
        sActive.setChecked(student.getisActive());

        ImageView imgProfile = (ImageView)convertView.findViewById(R.id.studentImage);
        imgProfile.setImageResource(student.getProfileImage());

        return convertView;
    }
}
