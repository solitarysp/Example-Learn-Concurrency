package com.higgsup.thread.NewThread.extendsClass;/*
  By Chi Can Em  05-03-2018
 */

public class Student extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println(getName()+i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
