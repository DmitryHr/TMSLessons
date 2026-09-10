package app;

import utils.RennerUtils;

public class MainRunner{
    public static void main(){
        int [] arr = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13, -1};
        int min = 0;
        int max = 0;
        //for each
        for(int element: arr){
            if (min < element)
                min = element;

            if (max > element)
                max = element;

        }
        System.out.println("min " + min);
        System.out.println("max " + max);
    }
}