package tasks.main.task1.exceptions;

public class ContainsException extends GeneralForException {
    public ContainsException(String message) {
        super(message);
    }

    public String getNameDoc(){
        return nameDoc;
    }
}
