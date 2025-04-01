package com.grepp.basic.d_control;

public class E_for {

    public static void main(String[] args) {
        //pracFor();
        pracDoubleFor();
    }

    //이중 for문
    private static void pracDoubleFor() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(j);
            }
            System.out.println();

        }


    }

    private static void pracFor() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hi~!");
        }
    }

}
