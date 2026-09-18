import by.tms.mainTask.task2.Accountant;
import by.tms.mainTask.task2.Director;
import by.tms.mainTask.task2.Worker;

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

        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        director.printPosition();
        worker.printPosition();
        accountant.printPosition();

    }
}
