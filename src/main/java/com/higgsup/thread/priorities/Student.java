package com.higgsup.thread.priorities;/*
  By Chi Can Em  05-03-2018
 */

public class Student extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <1 ; i++) {
            System.out.println(getName()+getPriority());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
