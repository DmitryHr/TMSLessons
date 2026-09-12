package homework.lesson6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Student {
    String name;
    String groupName;
    int mark;
    int hungryLevel;

    Student(String groupName, int mark, int hungryLevel){
        this.groupName = groupName;
        this.mark = mark;
        this.hungryLevel = hungryLevel;
    }

    public static void main(String[] args) {
        Student [] students = new Student[14];
        Random random = new Random();
        for(int index =0; index<students.length; index++){
            students[index] = new Student("Test", random.nextInt(11), random.nextInt(4));
        }
//        System.out.println(Arrays.toString(students));
        for(Student student : students){
            if(student.mark > 8){
                student.displayInfo();
            }
        }
        System.out.println(students[3].feed(3));
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupName='" + groupName + '\'' +
                ", mark=" + mark +
                ", hungryLevel=" + hungryLevel +
                '}';
    }
    public void displayInfo(){
        System.out.println(this.toString());
    }

    public boolean feed(int foodLevel){
        return foodLevel >= this.hungryLevel;
    }

}
