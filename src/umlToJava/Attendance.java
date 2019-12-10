package umlToJava;

public class Attendance {
    private double attendanceLevel;
    private Student student;
    private Seminar seminar;

    public Attendance(Student student, Seminar seminar) {
        this.student = student;
        this.seminar = seminar;
    }

    public void registerAttendance(Seminar seminar, Student student) {
        seminar.addAttendance(this);
        student.attendSeminar(this);
    }

    public void removeAttendance(Seminar seminar, Student student) {
        seminar.getAttendanceList().remove(student);
    }
}
