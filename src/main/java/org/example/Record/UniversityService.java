package org.example.Record;

public class UniversityService {

    public void printStudentDetails(Student student){
        System.out.println(student.toString());
    }

    public void updateStudentAge(Student student, int newAge){
        student.setAge(newAge);
    }
    public void printCourseDetails(Course course) {
        System.out.println(course.toString());
    }


}
