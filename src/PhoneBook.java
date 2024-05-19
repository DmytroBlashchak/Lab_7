import java.util.*;
import java.util.Scanner;

public class PhoneBook {
    public void inputData(Map<String, Integer> phoneBookMap, Scanner scanner) {
        String inputSurname;
        int inputPhoneNumber;

        for(int i = 0; i < 2; i++) {
                System.out.println("Enter suggested surname: ");
                inputSurname = scanner.nextLine();
                System.out.println("Enter user's phone number: ");
                inputPhoneNumber = Integer.parseInt(scanner.nextLine());

            phoneBookMap.put(inputSurname, inputPhoneNumber);
        }
    }

    public String getData (Scanner scanner) {
        System.out.println("Find a surname from the phone book: ");
        return scanner.nextLine();
    }

    public void findDataAndPair(Map<String, Integer> phoneBookMap) {
        if (phoneBookMap.containsKey("Dima")) {
            System.out.println("The key was found!");
        }

        if (phoneBookMap.containsValue(345)) {
            System.out.println("The phone number was found!");
        }

        System.out.println("The number of pairs key-value: " + phoneBookMap.size());
    }

    public void hereAreYourPeople(Map<String, Integer> phoneBookMap, String surname, Integer number) {
        if (phoneBookMap.containsKey(surname)) {
            System.out.println("The phone number of the user: " + number);
        } else {
            System.out.println("There's no such subscriber :(");
        }

        System.out.println("All of the subscribers: ");

        for (var entry : phoneBookMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public void banPerson(Map<String, Integer> phoneBookMap, String surname) {
        if (phoneBookMap.containsKey(surname)) {
            phoneBookMap.remove(surname);
            System.out.println("The user " + surname + " was banned!");
        } else {
            System.out.println("There's no such an abonent");
        }
    }
}
