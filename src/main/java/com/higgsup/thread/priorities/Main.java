package com.higgsup.thread.priorities;/*
  By Chi Can Em  05-03-2018
 */

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();

        student.setPriority(1);
        student1.setPriority(9);

        student.setName("student ");
        student1.setName("student1 ");

        student.start();
        student1.start();



  /*      Student student2 = new Student();
        Student student3 = new Student();

        student2.setPriority(9);
        student3.setPriority(1);

        student2.setName("student2 ");
        student3.setName("student3 ");

        student2.start();
        student3.start();*/
    }
}
