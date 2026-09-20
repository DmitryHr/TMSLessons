import by.tms.additionTask.model.EmploymentContract;
import by.tms.additionTask.model.FinancialInvoice;
import by.tms.additionTask.registr.Registr;
import by.tms.additionTask.model.GoodsSupplyContract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class AppalicatoinHomeworkSeven {
    public static void main(String[] args) throws ParseException {

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


        Registr registr = new Registr();
        Date docDate = new Date();

        GoodsSupplyContract supplyContract = new GoodsSupplyContract("SUP-01", "Электроника", 500, docDate);
        registr.saveDocument(supplyContract);
        registr.printInfoDoc(supplyContract);

        EmploymentContract employmentContract = new EmploymentContract("EMP-01", docDate, docDate, "NTCN");
        registr.saveDocument(employmentContract);
        registr.printInfoDoc(employmentContract);

        FinancialInvoice financialInvoice = new FinancialInvoice("FIN-01", docDate, 200.0, "Тест");
        registr.saveDocument(financialInvoice);
        registr.printInfoDoc(financialInvoice);

        System.out.println(registr.getIndex());

//        GoodsSupplyContract supplyContract = new GoodsSupplyContract("test26", "мыло", 20, docDate1);
//        supplyContract.printInfo();

    }

}
