class Automobile extends GgroundVehicles {
    private int automobilePower;
    private String fuel;

    public Automobile(String brand, String model, int year, String color, int automobilePower, String fuel) {
        super(brand, model, year, color);
        this.automobilePower = automobilePower;
        this.fuel = fuel;
    }

    public void getAutomobilInfo() {
        getInfo();
        System.out.print( " Мощность: " + this.automobilePower +", " + "Топливо: " + this.fuel );
    }

}

