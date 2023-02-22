public class Truck extends Automobile{
    private int bodyVolume;
    private String loadingMethod;

    public Truck(String brand, String model, int year, String color,
                 int automobilePower, String fuel, int bodyVolume, String loadingMethod) {
        super(brand, model, year, color, automobilePower, fuel);
        this.bodyVolume = bodyVolume;
        this.loadingMethod = loadingMethod;
    }

    public void getTruckInfo() {
        getAutomobilInfo();
        System.out.println( ", " + "Грузоподъемность: " + this.bodyVolume + ", "
                + "Погрузка: " + this.loadingMethod);
    }
}
