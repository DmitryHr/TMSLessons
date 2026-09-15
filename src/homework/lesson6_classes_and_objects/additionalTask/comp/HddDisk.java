package homework.lesson6_classes_and_objects.additionalTask.comp;

public class HddDisk {
    String name;
    int volume;
    String type;

    public HddDisk() {
    }

    public HddDisk(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public void information() {
        System.out.println("Название жесткого диска " + name);
        System.out.println("Объем жесткого диска " + volume);
        System.out.println("Тип жесткого диска " + type);
    }
}
