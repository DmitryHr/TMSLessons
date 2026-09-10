package homework.lesson2.part2;

public class SumOfNaturalNumbers {
    public int sumOfNaturalNumbers(int number){
        int sum = 0;
        for(int index = 1; index <= number; index++){
            sum += index;
        }
     return sum;
    }
}
