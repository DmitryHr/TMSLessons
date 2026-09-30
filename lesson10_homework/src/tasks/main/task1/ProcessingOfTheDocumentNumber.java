package tasks.main.task1;

import java.util.regex.Pattern;

public class ProcessingOfTheDocumentNumber {
    public static final String PATERN_MASK = "^\\d{4}-[A-Za-z]{3}-\\d{4}-[A-Za-z]{3}-\\d[A-Za-z]\\d[A-Za-z]$";
    public static String nameDoc = "";


    public void realizationMethod(String text){
        boolean validName = Pattern.matches(PATERN_MASK, text);
        if (validName){
            MethodForProcessingOfTheDocumentNumber.oneString(text);
            MethodForProcessingOfTheDocumentNumber.starString(text);
            MethodForProcessingOfTheDocumentNumber.delNumbers(text);
            MethodForProcessingOfTheDocumentNumber.letersMethod(text);
            MethodForProcessingOfTheDocumentNumber.checkContains(text);
            MethodForProcessingOfTheDocumentNumber.checkStartWith(text);
            MethodForProcessingOfTheDocumentNumber.checkEndWith(text);

        }
        else{
            System.out.println("Error");
        }
    }
}
