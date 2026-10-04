import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RannerArrayList {
    static void main() {
        List<String> listString = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Input text");
            String input = scanner.nextLine();
            listString.add(input);
            if (input.equals("0")){
                break;
            }
        }
        System.out.println(listString);
        System.out.println(listString.size());
        System.out.println(listString.get(3));
        listString.remove(3);
        System.out.println(listString);
    }
}
