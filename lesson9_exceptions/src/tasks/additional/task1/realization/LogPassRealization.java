package tasks.additional.task1.realization;

import tasks.additional.task1.exceptions.WrongLoginException;
import tasks.additional.task1.exceptions.WrongPasswordException;

public class LogPassRealization {
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getConfirmPass() {
        return confirmPass;
    }

    public void setConfirmPass(String confirmPass) {
        this.confirmPass = confirmPass;
    }

    private String login;
    private String pass;
    private String confirmPass;

    public boolean login(String login) throws WrongLoginException {
        if (login.contains(" ") || login.length() >= 20) {
            throw new WrongLoginException("Некорректный логин");
        } else return true;
    }

    public boolean password(String pass) throws WrongPasswordException {
        if (pass.contains(" ") || pass.length() >= 20 || !pass.matches(".*\\d.*")) {
            throw new WrongPasswordException("Некорректный пароль");
        } else return true;
    }

    public boolean confirmPass(String pass, String confirmPass) throws WrongPasswordException {
        if (!confirmPass.equals(pass)) {
            throw new WrongPasswordException("Пароли не сопадают");
        } else return true;
    }
}
