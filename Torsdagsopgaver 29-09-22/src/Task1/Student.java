package Task1;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    Student(String name){
        this.name = name;
    }

    public void addCourse(Course x){
        courses.add(x);
    }

    public String toString(){
        return "Student: " + name;
    }

}
