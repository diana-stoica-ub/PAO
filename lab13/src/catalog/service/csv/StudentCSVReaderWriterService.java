package catalog.service.csv;


import catalog.model.Student;

public class StudentCSVReaderWriterService implements CSVReaderWriter<Student> {

    private static StudentCSVReaderWriterService INSTANCE = null;
    private static final String FILE_NAME = "/resources/persistence/student.csv";

    public static synchronized StudentCSVReaderWriterService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new StudentCSVReaderWriterService();
        }
        return INSTANCE;
    }

    @Override
    public String getFileName() {
        return FILE_NAME;
    }

    @Override
    public Student processCSVLine(String line) {
        String[] split = line.split(SEPARATOR);
        return new Student(split[0], split[1]);
    }

    @Override
    public String convertObjectToCSVLine(Student object) {
        return object.getFirstName() + SEPARATOR + object.getLastName();
    }
}
