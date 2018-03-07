package com.higgsup.thread.NewThread.implementsInterface;/*
  By Chi Can Em  05-03-2018
 */

public class Student implements Runnable {


    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(i+Thread.currentThread().getName());
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
