package homework.lesson6_classes_and_objects.additionalTask.comp;

public class Ram {
    String name;
    int volume;

    public Ram(){

    }

    public Ram(String name, int volume){
        this.name = name;
        this.volume = volume;
    }

    public void information(){
        System.out.println("Название оперативной памяти " + name);
        System.out.println("Объем оперативной памяти " + volume);
    }
}
