package data;

import helpers.ReadFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class TestDataRegistration {
    public static Map<String, String[]> dataFromFile = ReadFile.
            readFile("src/test/resources/values.txt");
    public static List<String> keysList = new ArrayList<>(dataFromFile.keySet());

    public static String firstName = dataFromFile.get(keysList.get(0))[0],
            lastName = dataFromFile.get(keysList.get(0))[1],
            email = dataFromFile.get(keysList.get(1))[0],
            gender = dataFromFile.get(keysList.get(2))[0],
            number = dataFromFile.get(keysList.get(3))[0],
            dayOfBirth = dataFromFile.get(keysList.get(4))[0].split(" ")[0],
            monthOfBirth = dataFromFile.get(keysList.get(4))[0].split(" ")[1].split(",")[0],
            yearOfBirth = dataFromFile.get(keysList.get(4))[0].split(" ")[1].split(",")[1],
            uploadPicture = dataFromFile.get(keysList.get(7))[0],
            currentAddress = dataFromFile.get(keysList.get(8))[0],
            state = dataFromFile.get(keysList.get(9))[0].split(" ")[0],
            city = dataFromFile.get(keysList.get(9))[0].split(" ")[1];

    public static String[] subjects = dataFromFile.get(keysList.get(5));
    public static String[] hobbies = dataFromFile.get(keysList.get(6));
}
