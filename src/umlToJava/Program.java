package umlToJava;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private String name;
    private ProgramCoordinator programCoordinator;
    private List<Seminar> seminarList = new ArrayList<>();

    public Program(String name) {
        this.name = name;
        this.seminarList = new ArrayList<>();
    }

    public List<Teacher> getTeachers(){
        List<Teacher> teacherList = new ArrayList<>();
        for(Seminar s : seminarList){
            teacherList.add(s.getTeacher());
        }
        return teacherList;
    }

    public List<Attendance> getStudents(Seminar seminar) {
        return seminar.getAttendanceList();
    }

    public void addProgramCoordinator(ProgramCoordinator programCoordinator){
        this.programCoordinator = programCoordinator;
    }


}
