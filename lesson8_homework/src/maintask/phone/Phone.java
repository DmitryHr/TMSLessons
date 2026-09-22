package maintask.phone;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone() {
    }

    ;

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.printf("Звонит %s, Номер телефона %s\n", name, number);
    }

    public void sendMessage(String... numbers) {
        for (String num : numbers) {
            System.out.println(num);
        }
    }
}
