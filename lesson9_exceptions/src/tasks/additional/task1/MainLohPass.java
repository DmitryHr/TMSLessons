package tasks.additional.task1;

import tasks.additional.task1.realization.LogPassRealization;
import tasks.additional.task1.realization.LogPassValidator;

public class MainLohPass {


    static void main() {

        LogPassRealization logPassRealization = new LogPassRealization();
        logPassRealization.setLogin("Login");
        logPassRealization.setPass("1234asdf");
        logPassRealization.setConfirmPass("1234a sdf");

        boolean result = LogPassValidator.autorization(logPassRealization.getLogin(), logPassRealization.getPass(), logPassRealization.getConfirmPass());
        if(result){
            System.out.println("Авторизация прошла успешно");
        }else {
            System.out.println("Повторите попытку");
        }

    }
}
