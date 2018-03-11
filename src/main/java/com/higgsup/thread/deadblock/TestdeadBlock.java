package com.higgsup.thread.deadblock;/*
  By Chi Can Em  11-03-2018
 */

public class TestdeadBlock implements Runnable {

    public void run() {
        synchronized (Student.class) {
            try {
                System.out.println("TestdeadBlock vào Student");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Student2.class) {
                System.out.println("TestdeadBlock vào Student2");

            }
        }
    }
}
