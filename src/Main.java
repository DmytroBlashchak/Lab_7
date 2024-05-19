import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {
        Main mainObject = new Main();
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("Hello, It's project 7, please enter a mode you want to use here. If you don`t know which modes are available, just type 3 to get a 'Help'");
            int mode = scanner.nextInt();

            scanner.nextLine();

            try {
                mainObject.cases(mode);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid mode number.");
            }
        }
    }
    private void cases(int mode) {
        switch (mode) {
            case 1:
                Driver driver1 = new Driver("John", 30, 7);
                Driver driver2 = new Driver("Alice", 28, 4);
                int[] intParameters = new int[3];
                TaxiService taxiService = new TaxiService();

                System.out.println("Type a car brand which our driver has: ");
                String carBrand = scr.nextLine();
                System.out.println("Type engine power of this car: ");
                intParameters[0] = Integer.parseInt(scr.nextLine());
                System.out.println("Type the price of this car: ");
                intParameters[1] = Integer.parseInt(scr.nextLine());
                System.out.println("Type the year in which this car was produced: ");
                intParameters[2] = Integer.parseInt(scr.nextLine());

                Cars car1 = new Cars(carBrand, intParameters[0], driver1, intParameters[1], intParameters[2]);


                Cars car2 = new Cars("Nissan", 250, driver2, 14888, 1998);


                ArrayList<Cars> carList = new ArrayList<>();
                carList.add(car1);
                carList.add(car2);

                taxiService.AddFeatures(carList);
                Cars randomCar = Helper.getRandomCar(carList);
                taxiService.CarInfo(randomCar);
                return;
            case 2:
                Map<String, Integer> phoneBookMap = new HashMap<>();
                PhoneBook phoneBook = new PhoneBook();

                phoneBook.inputData(phoneBookMap, scr);
                String surname = phoneBook.getData(scr);
                Integer number = phoneBookMap.get(surname);
                phoneBook.hereAreYourPeople(phoneBookMap, surname, number);

                surname = phoneBook.getData(scr);


                phoneBook.banPerson(phoneBookMap, surname);
                return;
            case 3: // HELP!!!!
                System.out.println("If you type '1', you will go to the first task of this project, which is 'Taxi Service'\n" +
                        "If you type '2', you will go to the second task of this project, which is 'Phone Book'\n" +
                        "If you type '3', you'll get here again (Help)");
                return;
            default:
                System.out.println("Good bye! See you soon!");
                System.exit(0);
        }
    }
}
