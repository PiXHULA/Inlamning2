package umlToJava;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String name;
    private Seminar seminar;

    public void viewSubjectInfo() {
        System.out.println(seminar.getTeacher());
        for (Attendance a : seminar.getAttendanceList())
            System.out.println(a.getStudent());
    }

    public Subject(String name, Seminar seminar) {
        this.name = name;
        this.seminar = seminar;
        seminar.addSubject(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
