package umlToJava;

import java.util.ArrayList;
import java.util.List;

public class ProgramCoordinator {
    private String name;
    private List<Teacher> teacherList;
    private Program program;

    public ProgramCoordinator(String name, Program program) {
        this.name = name;
        this.program = program;
        this.teacherList = new ArrayList<>();
    }

    public Boolean findTeacher(String name){
        return teacherList.stream().anyMatch(e -> e.getName().equalsIgnoreCase(name));
    }

    public void addTeacher(Teacher teacher){
        teacherList.add(teacher);
    }
}
