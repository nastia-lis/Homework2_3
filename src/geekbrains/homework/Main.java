package geekbrains.homework;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //1 задание
        String[] testWords = {"Anastasia", "Aleksandr", "Anna", "Andrey", "Anna", "Vladimir", "Aleksandr", "Victoria", "Andrey", "Sergei", "Anna", "Andrey", "Victoria"};
        Map<String, Integer> words = new HashMap<>();
        Set<String> uniqueWords = new HashSet<>();
        Set<String> doubleWords = new HashSet<>();
        for (int i = 0; i < testWords.length ; i++) {
            Integer count = words.get(testWords[i]);
            if (count == null) {
                words.put(testWords[i], 1);
                uniqueWords.add(testWords[i]);
            } else {
                words.put(testWords[i], count + 1);
                doubleWords.add(testWords[i]);
            }
        }
        uniqueWords.removeAll(doubleWords);
        System.out.println("Уникальные слова: " + uniqueWords);
        System.out.println(words);

        //2 задание
        Phonebook phonebook = new Phonebook();
        phonebook.get("Lomov");
        phonebook.add("89063675012", "Rostova");
        System.out.println(phonebook.getBook());
    }
}