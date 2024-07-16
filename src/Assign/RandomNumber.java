package Assign;

import java.util.Random;

public class RandomNumber {

    public static void randomNumber() {
        int n;

        Random random = new Random();
        n = random.nextInt(1, 10);
        System.out.println("n="+n);

        while (n != 5){
            n = random.nextInt(1, 10);
            System.out.println("Number="+n);
       }
//        System.out.println("For loop ------->");
//        for(;n!=5;)
//        {
//            n = random.nextInt(1, 10);
//            System.out.println("Number for="+n);
//
//        }



    }
}