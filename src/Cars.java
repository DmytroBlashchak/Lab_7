class Cars {
    private String brand;
    private double enginePower;
    private Driver driver;
    private double price;
    private int year;

    public Cars(String brand, double enginePower, Driver driver, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }

    public void doEngineRepair() {
        this.enginePower *= 1.1;
    }

    public void hireNewDriver(Driver newDriver) {
        this.driver = newDriver;
    }

    public void increasePowerAndPrice() {
        this.enginePower *= 1.1;
        this.price *= 1.05;
    }

    public String getBrand() {
        return brand;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public Driver getDriver() {
        return driver;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }
}
