package com.example.yehuda_da.secondapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static com.example.yehuda_da.secondapp.R.*;


public class ListExsample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_list_exsample);

        ListView student = findViewById(id.lstStudents);
        //String[] srtStudents = new  String[]{"Moshe","David","Shlomo","Yehuda"};

        //ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.students));
        List<Student> students = new ArrayList<>();
        students.add(new Student(R.drawable.hourse,"סוס", "22", "0536202770", true));
        students.add(new Student(R.drawable.liberman,"ליברמן", "65", "0500000000", false));
        students.add(new Student(R.drawable.bibi,"נתניהו", "70", "0555555555", true));
        students.add(new Student(R.drawable.trump,"טראמפ", "33", "0555555555", true));
        students.add(new Student(R.drawable.trump,"טראמפ", "33", "0555555555", true));
        students.add(new Student(R.drawable.trump,"טראמפ", "33", "0555555555", true));
        students.add(new Student(R.drawable.trump,"טראמפ", "33", "0555555555", true));

        StudentsAddapter adapter = new StudentsAddapter(students);
        student.setAdapter(adapter);
    }
}
