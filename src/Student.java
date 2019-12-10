import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private Attendance attendance;
    private List<Attendance> attendanceList = new ArrayList<>();

    public List<Attendance> getSeminarsAttended(){
        return this.attendanceList;
    }

    public void attendSeminar(Attendance attendance){
        this.attendanceList.add(attendance);
    }
}
