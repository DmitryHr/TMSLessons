package tasks.main.task1.exceptions;

public class EndNameDocException extends GeneralForException {
    public EndNameDocException(String message) {
        super(message);
    }

    public String getNameDoc(){
        return nameDoc;
    }
}
