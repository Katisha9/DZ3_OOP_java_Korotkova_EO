public abstract class GgroundVehicles {
    private String brand;
    private String model;
    private int year;
    private String color;

    public GgroundVehicles(String brand, String model, int year, String color) {
    this.brand = brand;
    this.model = model;
    this.year = year;
    this.color = color;
    }

        public void getInfo() {
        System.out.print("Производитель: " + brand + "," + " Модель: " + model+ ","
                + " Год: " + year + "," + " Цвет: " + color+ ",");
        }




}
