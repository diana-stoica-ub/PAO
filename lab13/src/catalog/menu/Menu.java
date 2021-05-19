package catalog.menu;

import catalog.model.Student;
import catalog.service.StudentService;
import catalog.service.SubjectService;

import java.util.List;

public class Menu {

    private static SubjectService subjectService;
    private static StudentService studentService;

    public static void start() {
        subjectService = SubjectService.getInstance();
        studentService = StudentService.getInstance();

        while (true) {
            System.out.println("1: Get all students; 2: Add student; 3: Get all subjects; 4: Add subjects");
            Integer userInput = null;   //todo: read from user input
            switch (userInput) {
                case 1:
                    option1GetAllStudents();
                case 2:
                    option2AddStudent();
                case 3:
                    option3GetAllSubjects();
                case 4:
                    option4AddSubject();
            }
        }
    }

    public static void option1GetAllStudents() {
        List<Student> students = studentService.getStudents();
        //TODO...
    }

    public static void option2AddStudent() {
        //...
    }

    public static void option3GetAllSubjects() {
        //...
    }

    public static void  option4AddSubject() {
        //...
    }
}
