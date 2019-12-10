package umlToJava;

import java.util.ArrayList;
import java.util.List;

public class Seminar {
    private String name;
    private Teacher teacher;
    private Program program;
    private List<Attendance> attendanceList;
    private List<Subject> subjectList;

    public Seminar(String name, Teacher teacher, Program program) {
        this.name = name;
        this.teacher = teacher;
        this.program = program;
        this.attendanceList = new ArrayList<>();
        this.subjectList = new ArrayList<>();
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public int getTotalAttendance(List<Attendance> attendanceList){
        return attendanceList.size();
    }

    public List<Attendance> getAttendanceList() {
        return attendanceList;
    }

    public void addAttendance(Attendance attendance){
        this.attendanceList.add(attendance);

    }

    public void removeAttendance(Attendance attendance){
        this.attendanceList.remove(attendance);

    }
}
