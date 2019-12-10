import java.util.ArrayList;
import java.util.List;

public class Attendance {
    private double attendanceLevel;
    private Student student;
    private Seminar seminar;

    public Attendance(Student student, Seminar seminar) {
        this.student = student;
        this.seminar = seminar;
    }

    public void registerAttendance(Seminar seminar, Student student){
        this.seminarList.add(seminar);
        this.student = student;
    }

    public void removeAttendance(Seminar seminar, Student student){
        this.seminarList.remove(seminar);
        this.studentList.remove(student);
    }
}
