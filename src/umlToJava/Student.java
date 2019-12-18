package umlToJava;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private Attendance attendance;
    private List<Attendance> attendanceList = new ArrayList<>();

    public List<Attendance> getSeminarsAttended(){
        return this.attendanceList;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attendSeminar(Attendance attendance){
        this.attendance = attendance;
        this.attendanceList.add(attendance);
    }

    @Override
    public String toString() {
        return name;
    }
}
