package catalog.service.csv;

import catalog.model.Subject;

public class SubjectCSVReaderWriterService implements CSVReaderWriter<Subject> {

    private static SubjectCSVReaderWriterService INSTANCE = null;

    public static synchronized SubjectCSVReaderWriterService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SubjectCSVReaderWriterService();
        }
        return INSTANCE;
    }

    @Override
    public String getFileName() {
        return "/resources/persistence/subjects.csv";
    }

    @Override
    public Subject processCSVLine(String line) {
        String[] split = line.split(SEPARATOR);
        return new Subject(split[0], Integer.parseInt(split[1]));
    }

    @Override
    public String convertObjectToCSVLine(Subject object) {
        return object.getName() + SEPARATOR + object.getCreditPoints();
    }
}
