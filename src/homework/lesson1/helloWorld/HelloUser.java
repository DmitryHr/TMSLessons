package homework.lesson1.helloWorld;

import java.util.Scanner;

public class HelloUser {
    public void methodHelloUser(){
    Scanner text = new Scanner(System.in);
    System.out.println("Введите слово user");
    String user = text.nextLine();
    System.out.println("Вы ввели " + user + ". Как вы думаете, введенный "+ user +" = user. Если да, ты молодец!");
    text.close();
    }
}
