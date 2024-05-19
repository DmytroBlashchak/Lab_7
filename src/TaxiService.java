import java.util.ArrayList;

public class TaxiService {
    public void AddFeatures(ArrayList<Cars> carList) {
        for (int i = 0; i < carList.size() / 2; i++) {
            carList.get(i).doEngineRepair();
            carList.get(i).hireNewDriver(new Driver("New Driver", 25, 2));
        }

        for (int i = 1; i < carList.size(); i += 2) {
            carList.get(i).increasePowerAndPrice();
        }

        for (Cars car : carList) {
            Driver driver = car.getDriver();
            if (driver.getDrivingExperience() < 5 && driver.getAge() > 25) {
                driver.takeQualificationCourses();
            }
        }
    }

    public void CarInfo(Cars randomCar) {
        System.out.println("Car information:");
        System.out.println("Brand: " + randomCar.getBrand());
        System.out.println("Engine Power: " + randomCar.getEnginePower());
        System.out.println("Price: " + randomCar.getPrice());
        System.out.println("Year of Manufacture: " + randomCar.getYear());

        System.out.println("\nDriver information:");
        System.out.println("Driver's Name: " + randomCar.getDriver().getName());
        System.out.println("Driver's Age: " + randomCar.getDriver().getAge());
        System.out.println("Driving Experience: " + randomCar.getDriver().getDrivingExperience());

        System.out.println("\nA car of brand " + randomCar.getBrand() + " with driver " + randomCar.getDriver().getName() + " has arrived for you.");
        System.out.println("Driver " + randomCar.getDriver().getName() + " is now at the location.");
    }
}
