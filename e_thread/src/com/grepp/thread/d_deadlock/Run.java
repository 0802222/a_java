package com.grepp.thread.d_deadlock;

import com.grepp.thread.d_deadlock.character.Student;

public class Run {

    public static void main(String[] args) {
        Student mika = new Student();
        mika.setName("Mika");

        Student john = new Student();
        mika.setName("john");

        mika.start();
        john.start();
    }
}
