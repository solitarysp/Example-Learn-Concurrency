package com.higgsup.thread.NewThread.implementsInterface;/*
  By Chi Can Em  05-03-2018
 */

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        Thread thread = new Thread(student);
        Thread thread1 = new Thread(student1,"thread 1");
        thread.setName("thread ");
        thread.yield();
        thread.start();
        thread1.start();
    }
}
