package com.example.quiz;

import java.util.Random;

public class Test {
    public static void main(String[] args) {

        Random random1 = new Random();
        int rand1 = random1.nextInt(4);

        Random random2 = new Random();
        int rand2 = random2.nextInt(4);

        while (rand1 == rand2){
            random2 = new Random();
            rand2 = random2.nextInt(4);
        }

        Random random3 = new Random();
        int rand3 = random3.nextInt(4);

        while (rand1 == rand3 || rand2 == rand3){
            random3 = new Random();
            rand3 = random3.nextInt(4);
        }

        Random random4 = new Random();
        int rand4 = random4.nextInt(4);

        while (rand3 == rand4 || rand2 == rand4 || rand1 == rand4){
            random4 = new Random();
            rand4 = random4.nextInt(4);
        }

        System.out.println(rand1);
        System.out.println(rand2);
        System.out.println(rand3);
        System.out.println(rand4);
    }
}
