package tasks.additional.task1.exceptions;

public class LoginException extends LogPassException {
    public LoginException(String message) {
        super(message);
    }

    @Override
    public String getText() {
        return text;
    }
}
