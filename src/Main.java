
/*Создать иерархию родительский и дочерний классы для Транспорта
        Например Транспорт - > Автомобиль - > Автобус
        Транспорт - > Автомобиль - > Легковой
        Используем наследование, инкапсуляцию*/
public class Main {
    public static void main(String[] args) {
        Automobile KIARio = new Automobile("KIA", "RIO", 2023, "роял блу",
                120, "бензин");
        KIARio.getAutomobilInfo();
        System.out.println();
        Truck Renault = new Truck("Renault", "Magnum 440.26", 2020,"красный",
                300, "дизель", 24, "боковая");
        Renault.getTruckInfo();
        System.out.println();
    }
}
