package tms;

public class IfElseChecker {
    static void oldMain() {
        boolean logicalType1 = 5 < 3;

        /*
            Развернутый комментарий
            Развернутый комментарий
            Развернутый комментарий
         */
        if (logicalType1) {
            System.out.println("Внутри ифа!");
        } else if (10 > 4) {
            System.out.println("Внутри ифа!");
        } else if (5 < 7) {
            System.out.println("Внутри ифа!");
        } else if (logicalType1) {
            System.out.println("Внутри ифа!");
        } else if (logicalType1) {
            System.out.println("Внутри ифа!");
        } else {
            System.out.println("Снаружи ифа!");
        }

        boolean logicalType2 = 8 < 10;

        if (logicalType1 & getParam()) {
            System.out.println("Внутри ифа!");
        }

    }

    static boolean getParam() {
        System.out.println();
        return true;
    }


    static void ifBestPractice() {
        boolean firstVariable = 5 > 3;
        boolean secondVariable = 4 > 3;

        if (!firstVariable) {
            System.out.println("firstVariable exit");
            return;
        }

        System.out.println("ghkdfjkdsfs");
        System.out.println("ghkdfjkdsfs");
        System.out.println("ghkdfjkdsfs");

        if (!secondVariable) {
            System.out.println("secondVariable exit");
            return;
        }

        System.out.println("ghkdfjkdsfs");
        System.out.println("ghkdfjkdsfs");
        System.out.println("ghkdfjkdsfs");
        System.out.println("ghkdfjkdsfs");
    }

    private static void oldTernary(boolean logicalVariable) {
        String result = "";
        if (logicalVariable) {
            result = "Success";
        } else {
            result = "Failure";
        }
        System.out.println(result);
    }

    private static void ternary(boolean logicalVariable) {
        String result = logicalVariable ? "Success" : "Failure";

        System.out.println("new method: " + result);
    }

    static void main() {
        ternary(false);
    }
}
