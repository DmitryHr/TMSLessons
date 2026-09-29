package tasks.main.task1.exceptions;

public abstract class GeneralForException extends RuntimeException{
    String nameDoc;
        public GeneralForException(String message){
            super(message);
            this.nameDoc = message;
        }

        public abstract String getNameDoc();
}
