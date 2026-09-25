package tasks.additional.task1.realization;


import tasks.additional.task1.exceptions.LoginException;
import tasks.additional.task1.exceptions.PassException;

public class LogPassRealization {

    private String login;
    private String pass;
    private String confirmPass;

    public LogPassRealization(){};
    public LogPassRealization(String login, String pass, String confirmPass){
        this.login = login;
        this.pass = pass;
        this.confirmPass = confirmPass;
    };

    public int login() {
       if (login.contains(" ")){
            throw new LoginException(login);
        }
        else if (login.length()>20){
            throw new LoginException(login);
        }
        else return 1;
    }

    public int password(){
       if(pass.contains(" ")){
            throw new PassException(pass);
        }
        else if(pass.length()>20){
            throw new PassException(pass);
        }else if(!pass.matches(".*\\d.*")){
            throw new PassException(pass);
        }
        else return 1;
    }

    public int confirmPass(){
       if(!confirmPass.equals(pass)){
           throw new PassException(confirmPass);
        }
        else {return 1;
        }
    }
}
