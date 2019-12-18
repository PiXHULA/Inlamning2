package umlToJava;

public class Attendance {
    private int attendanceLevel;
    private Student student;
    private Seminar seminar;

    public Attendance(){}

    public Student getStudent() {
        return student;
    }

    public int getAttendanceLevel(){
        return this.attendanceLevel;
    }

    public void registerAttendance(Seminar seminar, Student student) {
        this.seminar=seminar;
        this.student=student;
        this.seminar.addAttendance(this);
        this.student.attendSeminar(this);
        attendanceLevel++;
    }

    public void removeAttendance(Seminar seminar, Student student) {
        seminar.getAttendanceList().remove(this);
        student.getSeminarsAttended().remove(this);
    }

    @Override
    public String toString() {
        return this.student.getName();
    }
}
