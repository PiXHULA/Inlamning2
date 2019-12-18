package umlToJava;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        //PROGRAM
        Program java19 = new Program("Java19");

        //PROGRAM COORDINATOR
        ProgramCoordinator programCoordinator = new ProgramCoordinator("Sara Funktionslös", java19);

        //TEACHER
        Teacher teacher1 = new Teacher("Robert Kärrbrant");

        //STUDENTS
        Student s1 = new Student("Joakim");
        Student s2 = new Student("Fazli");
        Student s3 = new Student("Wille");
        Student s4 = new Student("Atef");
        Student s5 = new Student("Elias");

        //SEMINAR
        Seminar lektion1 = new Seminar("Lektion1", teacher1, java19);
        Seminar lektion2 = new Seminar("Lektion2", teacher1, java19);

        //SUBJECT
        Subject subject1 = new Subject("Obj.Orienterad analys och design", lektion1);
        Subject subject2 = new Subject("UML vetenskap", lektion1);

        java19.addSeminar(lektion1);
        java19.addSeminar(lektion2);

        teacher1.addSeminar(lektion1);
        teacher1.addSeminar(lektion2);


        //ATTENDANCE
        List<Attendance> lektion1Attendance = new ArrayList<>(){{
            new Attendance().registerAttendance(lektion1, s1);
            new Attendance().registerAttendance(lektion1, s2);
            new Attendance().registerAttendance(lektion1, s3);
            new Attendance().registerAttendance(lektion1, s4);
            new Attendance().registerAttendance(lektion1, s5);
        }};

        List<Attendance> lektion2Attendance = new ArrayList<>(){{
            new Attendance().registerAttendance(lektion2, s2);
            new Attendance().registerAttendance(lektion2, s1);
            new Attendance().registerAttendance(lektion2, s3);
            new Attendance().registerAttendance(lektion2, s4);
            new Attendance().registerAttendance(lektion2, s5);
        }};

        lektion2.getAttendanceList().get(0).removeAttendance(lektion2, s2);

        programCoordinator.addTeacher(teacher1);

        System.out.println(programCoordinator.getProgram());
        programCoordinator.showTeachersInProgram();
        System.out.println("Elever i programmet: " + java19.getStudents());
        System.out.println("Fazli har närvarat " + s2.getSeminarsAttended().size() + " gånger av " + java19.getSeminarList().size());
        System.out.println(teacher1.getName() + " kör lektioner " + teacher1.getSeminarHistory());
        System.out.println("Subjects på lektion 1 " + lektion1.getSubjectList());
        System.out.println("Antal närvarande på lektion 1: " + lektion1.getTotalAttendance());
        System.out.println("Antal närvarande på lektion 2: " + lektion2.getTotalAttendance());



    }
}
