package tasks.main.task1;

import tasks.main.task1.exceptions.ContainsException;
import tasks.main.task1.exceptions.EndNameDocException;
import tasks.main.task1.exceptions.StartNameDocException;
import tasks.main.task1.realization.ExceptionsChecker;

import java.util.Scanner;

public class MainRunner {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        ExceptionsChecker exceptionsChecker = new ExceptionsChecker();
        String text = scanner.nextLine();

        try{
            exceptionsChecker.exceptionsChecker(text);
        }
        catch (ContainsException e){
            System.out.println("Введенный текст " + e.getNameDoc()+" текст содержит abc");
        }
        catch (StartNameDocException e){
            System.out.println("Введенный текст " + e.getNameDoc()+" начинается с 555");
        }
        catch (EndNameDocException e){
            System.out.println("Введенный текст " + e.getNameDoc()+" заканчивается на 1a2b");
        }

    }
}
