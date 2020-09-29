package geekbrains.homework;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
   private Map <String, String> book = new HashMap<>();

    public Map<String, String> getBook() {
        return book;
    }

    public Phonebook() {
        book.put("89061235665", "Ivanov");
        book.put("89061235436", "Petrov");
        book.put("89061236366", "Frolov");
        book.put("89061224555", "Ivanov");
        book.put("89061256349", "Kozlov");
        book.put("89061236677", "Lomov");
        book.put("89024233665", "Lomov");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void get(String firstName) {
        for (Map.Entry<String, String> entry : book.entrySet()) {
            if (firstName.equals(entry.getValue())) {
                System.out.println(firstName + "- phone number: " + entry.getKey());
            }
        }
    }

    public void add(String phoneNumber, String firstName) {
        book.put(phoneNumber, firstName);
    }
}
