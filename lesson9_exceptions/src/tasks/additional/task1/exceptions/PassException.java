package tasks.additional.task1.exceptions;

public class PassException  extends LogPassException {
    public PassException(String message) {
        super(message);
    }

    @Override
    public String getText() {
        return text;
    }
}

