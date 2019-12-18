package umlToJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Program {
    private String name;
    private ProgramCoordinator programCoordinator;
    public List<Seminar> seminarList;



    public Program(String name) {
        this.name = name;
        this.seminarList = new ArrayList<>();
    }

    public List<Teacher> getTeachers() {
        List<Teacher> teacherList = new ArrayList<>();
        for (Seminar s : this.seminarList) {
            teacherList.add(s.getTeacher());
        }
        return teacherList;
    }

    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        for (Seminar s : this.seminarList) {
            for(Attendance a : s.getAttendanceList()){
                if(!studentList.contains(a.getStudent()))
                    studentList.add(a.getStudent());
            }
        }
        return studentList;
    }
    public void addProgramCoordinator(ProgramCoordinator programCoordinator) {
        this.programCoordinator = programCoordinator;
    }

    public void addSeminar(Seminar seminar) {
        seminar.setProgram(this);
        this.seminarList.add(seminar);
    }

    public List<Seminar> getSeminarList() {
        return seminarList;
    }

    @Override
    public String toString() {
        return "Program: " + this.name;
    }
}
