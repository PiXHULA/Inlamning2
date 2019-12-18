package umlToJava;

import java.util.ArrayList;
import java.util.List;

public class Seminar {

    private String name;
    private Teacher teacher;
    private Program program;
    private List<Attendance> attendanceList;
    private List<Subject> subjectList;

    public Seminar(String name, Teacher teacher, Program program){
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
        int countAttendence = 0;
        for (Attendance a : attendanceList)
                countAttendence++;
        return countAttendence;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }
    public void addSubject(Subject subject){
        this.subjectList.add(subject);
    }

    public int getTotalAttendance(){
        return attendanceList.size();
    }

    public List<Attendance> getAttendanceList() {
        return this.attendanceList;
    }

    public void addAttendance(Attendance attendance){
        this.attendanceList.add(attendance);
    }

    public void removeAttendance(Attendance attendance){
        this.attendanceList.remove(attendance);
    }
    public void removeAttendance(List<Attendance> attendance, Student student){
        this.attendanceList = attendance;
        attendance.remove(student);
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
