package tasks.additional.task1;

import tasks.additional.task1.exceptions.LoginException;
import tasks.additional.task1.exceptions.PassException;
import tasks.additional.task1.realization.LogPassRealization;
import tasks.main.task1.realization.ExceptionsChecker;

public class MainLohPass {

    static int count = 0;
    static void main() {
        LogPassRealization logPassRealization = new LogPassRealization("Dima", "ввввввввD", "123456D");

        try {
            count += logPassRealization.login();
            } catch (LoginException e) {
            System.out.println("Текст логина содержит пробелы или длинна больше 20 символов");

        }
        try {
            count += logPassRealization.password();
        }catch (PassException e){
            System.out.println("Текст пароля содержит пробелы или длинна больше 20 символов");
        }
        try {
            count += logPassRealization.confirmPass();
        }catch (PassException e){
            System.out.println("Пароли не совпадают");
        }

        if (count ==3){
            System.out.println("Вход выполнен успешно");
        }
        else System.out.println("Повторите попытку");

    }
}
