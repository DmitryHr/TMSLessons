package tasks.additional.task1.exceptions;

public abstract class LogPassException extends RuntimeException {
    String text;
    public LogPassException(String message) {
        super(message);
        this.text = message;
    }

    public abstract  String getText();
}
