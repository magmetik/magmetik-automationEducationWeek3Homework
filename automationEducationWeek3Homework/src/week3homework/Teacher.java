package week3homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Person {

    ArrayList<String> coursesTeaching = new ArrayList<>();

    public void setCoursesTeaching(){
        this.coursesTeaching = coursesTeaching;
    }

    public ArrayList<String> getCoursesTeaching(){
        return coursesTeaching;
    }

    public int getCourseCount(){
        for(int i = 1 ; i <= 3 ; i++){
            System.out.println("Teacher:");
            System.out.println("Please enter course name to teach");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.next();
            coursesTeaching.add(course);
            if(coursesTeaching.size() >= 3){
                System.out.println("You cannot give more than 3 courses");
            }
        }
        System.out.println(coursesTeaching);
        System.out.println("Another teacher");
        return coursesTeaching.size();
    }

}



