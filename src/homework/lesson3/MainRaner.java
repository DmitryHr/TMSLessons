package homework.lesson3;

import homework.lesson3.additionalTask.BubbleSort;
import homework.lesson3.additionalTask.EvenElementsExtractor;
import homework.lesson3.additionalTask.OddIndexZeroReplacer;
import homework.lesson3.additionalTask.SortName;
import homework.lesson3.mainTask.*;

public class MainRaner {
    public static void main(String[] args) {
      /*
      Основное задание. Задание 0
       */
        System.out.println("Выполняется Основное задание. Задание 0");
        lessonTreeMainTasksTaskNull();

        /*
      Основное задание. Задание 1
       */
        System.out.println("Выполняется Основное задание. Задание 1");
        lessonTreeMainTaskOne();
      /*
      Основное задание. Задание 2
       */
        System.out.println("Выполняется Основное задание. Задание 2");
        RandomArrayAnalyzer randomArrayAnalyzer = new RandomArrayAnalyzer();
        randomArrayAnalyzer.createArray(10);
        /*
      Основное задание. Задание 3
       */
        System.out.println("Выполняется Основное задание. Задание 3");
        ArrayAverageComparator arrayAverageComparator = new ArrayAverageComparator();
        arrayAverageComparator.arrayAverage();

        /*
      Дополнительное задание. Задание 4
       */
        System.out.println("Выполняется дополнительное задание. Задание 4");
        EvenElementsExtractor evenElementsExtractor = new EvenElementsExtractor();
        int lengthArray = evenElementsExtractor.inputLengthArray();
        evenElementsExtractor.generateArray(lengthArray);
        /*
      Дополнительное задание. Задание 5
       */
        System.out.println("Выполняется дополнительное задание. Задание 5");
        OddIndexZeroReplacer oddIndexZeroReplacer = new OddIndexZeroReplacer();
        oddIndexZeroReplacer.oddIndexZeroReplacer();

        /*
      Дополнительное задание. Задание 6
       */
        System.out.println("Выполняется дополнительное задание. Задание 6");
        SortName sortName = new SortName();
        sortName.sortName();
        /*
      Дополнительное задание. Задание 7
       */
        System.out.println("Выполняется дополнительное задание. Задание 7");
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort();

    }

    public static void lessonTreeMainTasksTaskNull() {
        NumberSearch numSearch = new NumberSearch();
        ScannerForLessonTree scannerForLessonTree = new ScannerForLessonTree();
        System.out.println("Введите любое целое число");
        numSearch.numberSearch(scannerForLessonTree.ScannerForLessonTree());
    }


    public static void lessonTreeMainTaskOne() {
        ScannerForLessonTree scannerForLessonTree = new ScannerForLessonTree();
        System.out.println("Введите любое целое число");
        DeleteNumberFomArray deleteNumberFomArray = new DeleteNumberFomArray();
        deleteNumberFomArray.deleteNumberFomArray(scannerForLessonTree.ScannerForLessonTree());
    }
}
