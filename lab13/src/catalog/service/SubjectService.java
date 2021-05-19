package catalog.service;

import catalog.model.Subject;
import catalog.service.csv.SubjectCSVReaderWriterService;

public class SubjectService {

    private static SubjectService INSTANCE = null;
    private SubjectCSVReaderWriterService cSVReaderWriterService;

    private SubjectService() {
        cSVReaderWriterService = SubjectCSVReaderWriterService.getInstance();
    }
    public static synchronized SubjectService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SubjectService();
        }
        return INSTANCE;
    }
}
