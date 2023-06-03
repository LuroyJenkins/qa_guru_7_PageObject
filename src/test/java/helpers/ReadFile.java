package helpers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public abstract class ReadFile {
    protected static LinkedHashMap<String, String[]> readFile(String pathToFile) {
        LinkedHashMap<String, String[]> fileMap = new LinkedHashMap<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(pathToFile));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }

        while (scanner != null && scanner.hasNextLine()) {
            String[] lineEntity = scanner.nextLine().split(":");
            String[] liveValues = lineEntity[1].split(";");
            fileMap.put(lineEntity[0], liveValues);
        }

        return fileMap;
    }
}
