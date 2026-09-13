package homework.lesson6_classes_and_objects.additionalTask.comp;

public class Computer {
    double price;
    String model;
    Ram ram;
    HddDisk hdd;

    public Computer(double price, String model){
        this.price = price;
        this.model = model;
        this.ram = new Ram("Samsung Electronics", 32);
        this.hdd = new HddDisk("Kingston", 2000, "Внутренний");
    }
    public Computer(double price, String model, HddDisk hdd, Ram ram) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void information(){
        System.out.println("Цена компьютера " + price);
        System.out.println("Модель компьютера " + model);
//        System.out.print("Жесткий диск ");
        hdd.information();
//        System.out.println();
//        System.out.print("Оперативная память ");
        ram.information();
    }
}
