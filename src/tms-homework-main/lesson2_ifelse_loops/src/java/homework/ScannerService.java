package tms;

import java.util.Scanner;

public class ScannerService {

    public void scan() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Привет, назови имя: ");

            System.out.println(scanner.nextLine());
        }
    }
}
