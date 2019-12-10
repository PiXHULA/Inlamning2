package umlToJava;

public class Subject {
    private String name;
    private Seminar seminar;
    public void viewSubjectInfo(){
        seminar.getAttendanceList();
    }

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
