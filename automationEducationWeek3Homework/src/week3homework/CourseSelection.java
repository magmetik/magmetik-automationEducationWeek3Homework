package week3homework;

public class CourseSelection {

    public static void main(String[] args){

        Student student = new Student();
        Course course = new Course();
        student.getStudentInfo();
        course.getCourseCredits();
        student.getStudentCountForCourse();

        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        Teacher teacher3 = new Teacher();

        teacher1.getCourseCount();
        teacher2.getCourseCount();
        teacher3.getCourseCount();

    }
}
