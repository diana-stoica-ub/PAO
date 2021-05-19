package catalog.service;

import catalog.model.Student;
import catalog.service.csv.StudentCSVReaderWriterService;

import java.util.List;

public class StudentService {

    private static StudentService INSTANCE = null;
    private static StudentCSVReaderWriterService csvReaderWriter;

    private StudentService() {
        this.csvReaderWriter = StudentCSVReaderWriterService.getInstance();
    }

    public static synchronized StudentService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new StudentService();
        }
        return INSTANCE;
    }

    public void addStudent(String firstName, String lastName) {
        Student student = buildStudent(firstName, lastName);
        csvReaderWriter.write(student);
    }

    public List<Student> getStudents() {
        return csvReaderWriter.read();
    }

    private Student buildStudent(String firstName, String lastName) {
        return new Student(firstName, lastName);
    }
}
