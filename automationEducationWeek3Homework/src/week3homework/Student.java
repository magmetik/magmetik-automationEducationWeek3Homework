package week3homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {

    int year;

    public void getStudentInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name");
        String name = scanner.next();
        System.out.println("Please enter surname");
        String surname = scanner.next();
        System.out.println("Please enter age");
        int age = scanner.nextInt();
        System.out.println("Please enter gender");
        String gender = scanner.next();
        System.out.println("Please enter university year");
        int year = scanner.nextInt();
    }

    public void getStudentCountForCourse() {

        ArrayList<String> courseArray2 = new ArrayList<String>();

        courseArray2.add("İngilizce");
        courseArray2.add("Fransızca");
        courseArray2.add("İspanyolca");
        courseArray2.add("Çince");
        courseArray2.add("İtalyanca");
        courseArray2.add("Rusça");

        int studentCount1 = 0;
        int studentCount2 = 0;
        int studentCount3 = 0;
        int studentCount4 = 0;
        int studentCount5 = 0;
        int studentCount6 = 0;

        ArrayList<Integer> Fransızca = new ArrayList<Integer>();
        ArrayList<Integer> İngilizce = new ArrayList<Integer>();
        ArrayList<Integer> İspanyolca = new ArrayList<Integer>();
        ArrayList<Integer> Çince = new ArrayList<Integer>();
        ArrayList<Integer> İtalyanca = new ArrayList<Integer>();
        ArrayList<Integer> Rusça = new ArrayList<Integer>();


        int i = 0;
        while ((studentCount1 < 20) || (studentCount2 < 20) || (studentCount3 < 20) || (studentCount4 < 20) || (studentCount5 < 20) || (studentCount6 < 20)) {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            System.out.println("Please enter course name");
            if (courseArray2.contains(name)) {
                switch (name) {
                    case "İngilizce":
                        if (studentCount1 < 20) {
                            studentCount1++;
                            System.out.println("Course name: " + name + " Student count: " + studentCount1);
                            İngilizce.add(studentCount1);
                            break;
                        } else {
                            studentCount1 = studentCount1;
                            break;
                        }
                    case "Fransızca":
                        if (studentCount2 < 20) {
                            studentCount2++;
                            System.out.println("Course name: " + name + " Student count: " + studentCount2);
                            break;
                        } else {
                            studentCount2 = studentCount2;
                            break;
                        }
                    case "İspanyolca":
                        if (studentCount3 < 20) {
                            studentCount3++;
                            System.out.println("Course name: " + name + " Student count: " + studentCount3);
                            break;
                        } else {
                            studentCount3 = studentCount3;
                            break;
                        }
                    case "Çince":
                        if (studentCount4 < 20) {
                            studentCount4++;
                            System.out.println("Course name: " + name + " Student count: " + studentCount4);
                            break;
                        } else {
                            studentCount4 = studentCount4;
                            break;
                        }
                    case "İtalyanca":
                        if (studentCount5 < 20) {
                            studentCount5++;
                            System.out.println("Course name: " + name + " Student count: " + studentCount5);
                            break;
                        } else {
                            studentCount5 = studentCount5;
                            break;
                        }
                    case "Rusça":
                        if (studentCount6 < 20) {
                            studentCount6++;
                            System.out.println("Course name: " + name + " Student count: " + studentCount6);
                            break;
                        } else {
                            studentCount6 = studentCount6;
                            break;
                        }
                    default:
                        System.out.println("No student");
                }
            } else {
                System.out.println("Please enter new course name");
                break;
            }
            i++;
        }
        System.out.println("Course reached to maximum students");

    }

}



