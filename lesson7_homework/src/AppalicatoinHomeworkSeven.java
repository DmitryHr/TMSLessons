import by.tms.additionTask.registr.Registr;
import by.tms.additionTask.model.GoodsSupplyContract;

import java.util.Calendar;
import java.util.Date;

public class AppalicatoinHomeworkSeven {
    public static void main(String[] args) {

//        Figure[] figure = new Figure[5];
//        figure[0] = new Treangle(20, 40, 10);
//        figure[1] = new Rectangle(50, 60);
//        figure[2] = new Circle(40);
//        figure[3] = new Treangle(10, 25, 10);
//        figure[4] = new Rectangle(25, 30);
//
//        double totflPerimetr = 0;
//
//        for (Figure number : figure){
//            System.out.printf("%s: Площадь = %.2f, Перимерт = %.2f%n",
//            number.getClass().getSimpleName(),
//             number.area(), number.perimetr()
//            );
//            totflPerimetr += number.perimetr();
//        }
//
//        System.out.println("Общая сумма периметра для всех фигур равна " + totflPerimetr);

//        Director director = new Director();
//        Worker worker = new Worker();
//        Accountant accountant = new Accountant();
//
//        director.printPosition();
//        worker.printPosition();
//        accountant.printPosition();

        Date docDate1 = createDate(2024, Calendar.JANUARY, 15);

        GoodsSupplyContract supplyContract = new GoodsSupplyContract("test26", "мыло", 20,docDate1);
        supplyContract.printInfo();

    }
    private static Date createDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }
}
