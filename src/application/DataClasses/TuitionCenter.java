package application.DataClasses;

import java.util.ArrayList;

public interface TuitionCenter {
    ArrayList<Books> books = new ArrayList<>();
    ArrayList<Course> courses = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<BookedCourses> bookedCourses= new ArrayList<>();
}
