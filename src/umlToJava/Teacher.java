package umlToJava;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private List<Seminar> seminarList;

    public Teacher(String name) {
        this.name = name;
        this.seminarList = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public List<Seminar> getSeminarHistory(){
        return this.seminarList;
    }

    public void addSeminar(Seminar seminar){
        this.seminarList.add(seminar);
    }

    public Seminar getCurrentSeminar(){
        return this.seminarList.get(this.seminarList.size() - 1);
    }

    @Override
    public String toString() {
        return "Lärarens namn: " + this.name;
    }
}
