package week3homework;

import java.util.*;

public class Course {

    String name;
    int credit;
    int studentCount;


    public Course() {
        name = "Türkçe";
        credit = 2;
    }

    public Course(String name, int credit) {
        this.name = name;
        this.credit = credit;
        this.studentCount = studentCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }


    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public int getStudentCount() {
        return studentCount;
    }


    public void getCourseCredits() {

        ArrayList<String> courseArray = new ArrayList<String>();
        courseArray.add("İngilizce");
        courseArray.add("Fransızca");
        courseArray.add("İspanyolca");
        courseArray.add("Çince");
        courseArray.add("İtalyanca");
        courseArray.add("Rusça");

        ArrayList<Integer> creditArray = new ArrayList<Integer>();
        creditArray.add(3);
        creditArray.add(4);
        creditArray.add(4);
        creditArray.add(5);
        creditArray.add(6);
        creditArray.add(6);

        int sumOfCredit = 0;

        System.out.println("Please enter course name");
        for(int i=1; i < courseArray.size(); i++){
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            if(courseArray.contains(name)){
                System.out.println(name);
                int credit = creditArray.get(courseArray.indexOf(name));
                System.out.println(credit);
                sumOfCredit += credit;
                //StudentCourseArray.add(name);
                System.out.println("Ders: " + name);
                if(sumOfCredit < 20) {
                    System.out.println("Total credit: " + sumOfCredit);
                }
                else if(sumOfCredit >= 20){
                    sumOfCredit -= credit;
                    System.out.println("You can not take more than 20 credit");
                    System.out.println("total credit: " + sumOfCredit);
                    break;
                }
            }
            else{
                System.out.println("Please enter new course name");
                break;
            }

        }
    }
}

















