package maintask.phone;

public class ApplicationPhone {
    static void main() {

        /*
        Задание 1. Класс Phone
         */
        Phone iphone = new Phone("+3751112233", "17", 200);
        Phone samsung = new Phone("+37511122222", "S21", 250);
        Phone huawei = new Phone("+37533322222", "Pura 10", 300);

        System.out.printf("Модель телефона: %s\nНомер телефона: %s\nВес телефона: %d\n", iphone.getModel(), iphone.getNumber(), iphone.getWeight());
        System.out.printf("Модель телефона: %s\nНомер телефона: %s\nВес телефона: %d\n", samsung.getModel(), samsung.getNumber(), samsung.getWeight());
        System.out.printf("Модель телефона: %s\nНомер телефона: %s\nВес телефона: %d\n", huawei.getModel(), huawei.getNumber(), huawei.getWeight());

        iphone.receiveCall("Sergey");
        samsung.receiveCall("Dima");
        huawei.receiveCall("Sveta");

        iphone.receiveCall("Сергей", iphone.getNumber());
        samsung.receiveCall("Dima", samsung.getNumber());
        huawei.receiveCall("Sveta", huawei.getNumber());

        iphone.sendMessage("+999999999", "+88888888888", "+77777777777");
        samsung.sendMessage("+6666666666", "+55555555555", "+4444444444");
        huawei.sendMessage("+33333333333", "+2222222222222", "+1111111111111");

    }
}
