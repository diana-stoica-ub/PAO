package catalog.service.csv;

import catalog.model.CSVCompatible;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface CSVReaderWriter<T extends CSVCompatible> {

    String SEPARATOR = ",";

    String getFileName();

    T processCSVLine(String line);

    String convertObjectToCSVLine(T object);

    default List<T> read() {
        File file = new File(getFileName());

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            List<T> resultLines = new ArrayList<>();
            String currentLine = bufferedReader.readLine();
            while (currentLine != null) {
                resultLines.add(processCSVLine(currentLine));
                currentLine = bufferedReader.readLine();
            }
            return resultLines;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return Collections.emptyList();
        } catch (IOException e) {
            System.out.println("Cannot read from file");
            return Collections.emptyList();
        }
    }

    default void write(T object) {
        //TODO: open file, instantiate bufferedwriter, and write the object converted using convertObjectToCSVLine method
    }
}
