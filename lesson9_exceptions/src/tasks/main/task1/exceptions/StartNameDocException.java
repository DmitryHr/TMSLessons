package tasks.main.task1.exceptions;

public class StartNameDocException extends GeneralForException{

    public StartNameDocException(String message){
        super(message);
        this.nameDoc = message;
    }

    public String getNameDoc(){
        return nameDoc;
    }
}
