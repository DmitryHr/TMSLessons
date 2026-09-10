package homework.lesson1;
import homework.lesson1.helloWorld.MyHelloWorld;
import homework.lesson1.helloWorld.HelloUser;

public class MainLessonOne {

    public static void main(String [] args){
        /**
         * 1) Написать программу для вывода «Hello World» на консоль
         */
        System.out.println("Hello world!");

        /**
         * 2) Написать программу для вывода «Hello World» на консоль, задействовав состояние объектов других классов.
         * То есть необходимо вывести строчку либо ее часть, использовав поля другого класса.
         */
        MyHelloWorld mhw = new MyHelloWorld();
        mhw.methodHelloWorld();

        /**
         * 3*) Для себя можете под свою систему установить переменную окружения JAVA_HOME, указав путь к директории с
         * jdk. Также необходимо обновить переменную PATH, добавив в нее значение $JAVA_HOME/bin. Синтаксис и путь
         * выполнения будут отличаться в зависимости от системы. В конечном итоге команда в терминале  "java -version"
         * должна вывести версию jdk. Также я не ограничиваю вас в использовании сторонних менеджеров типа homebrew в системе,
         * как в маке
         */
        System.out.println("Проверено, при вводе в консоль java -version, выводит информацию об установленной версии");


        /**
         * 4* задание для себя на самостоятельный поиск информации) Написать программу для вывода «Hello <user>» на консоль. Пусть <user>
         * вводится с консоли, программа должна потребовать ввод <user>.
         * Для чтения с консоли используйте класс Scanner.
         */
        HelloUser huser = new HelloUser();
        huser.methodHelloUser();

    }
}
