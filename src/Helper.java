import java.util.ArrayList;

class Helper {
    public static Cars getRandomCar(ArrayList<Cars> cars) {
        int randomIndex = new java.util.Random().nextInt(cars.size());
        return cars.get(randomIndex);
    }
}
