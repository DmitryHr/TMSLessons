package tms;

public class SwitchChecker {
    static void main() {
        int orderStatus = 3;

/*        if (orderStatus == 1) {
            System.out.println("New!");
        } else if (orderStatus == 2) {
            System.out.println("Processing!");
        } else if (orderStatus == 3) {
            System.out.println("Canceled!");
        }*/

        int result = 0;

        switch (orderStatus) {
            case 10:
                result = 10;
                System.out.println("New status!");
                break;
            case 2:
                result = 2;
                System.out.println("Processing!");
                break;
            case 20:
                result = 20;
                System.out.println("Mega New status!");
                break;
            case 1:
                result = 1;
                System.out.println("New!");
                break;
            case 3:
                result = 3;
                System.out.println("Canceled!");
                break;
            default:
                System.out.println("Final result: " + result);
        }
        result = switch (orderStatus) {
            case 2 -> {
                System.out.println("Canceled!");
                yield 2;
            }
            case 3 -> 3;
            case 4 -> 4;
            default -> 5;
        };

        System.out.println("Final result: " + result);

    }
}
