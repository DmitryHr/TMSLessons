package tasks.additional.task1.realization;

import tasks.additional.task1.exceptions.WrongLoginException;
import tasks.additional.task1.exceptions.WrongPasswordException;

public class LogPassValidator {

    public static boolean autorization(String login, String pass, String confirmPass){
        LogPassRealization logPass = new LogPassRealization();
        try {
            if(!logPass.login(login) || !logPass.password(pass) || !logPass.confirmPass(pass, confirmPass));
            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }
}
