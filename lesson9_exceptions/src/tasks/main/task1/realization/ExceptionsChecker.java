package tasks.main.task1.realization;

import tasks.main.task1.exceptions.ContainsException;
import tasks.main.task1.exceptions.EndNameDocException;
import tasks.main.task1.exceptions.StartNameDocException;

public class ExceptionsChecker {

    public void exceptionsChecker(String text){
        if (text.contains("abc")){
            throw new ContainsException(text);

        }
        System.out.println("Success. Текст не содержит запрещенные  символы abc");

        if (text.startsWith("555")){
            throw new StartNameDocException(text);
        }
        System.out.println("Success. Тест не начинается с запррещенных сомволов 555");


        if(text.endsWith("1a2b")) {
            throw new EndNameDocException(text);
        }
       System.out.println("Success. Текст не закнчивается на запррещенные сомволы 1a2b");


    }
}
