package com.higgsup.thread.deadblock;/*
  By Chi Can Em  11-03-2018
 */

public class TestdeadBlock2 implements Runnable {
    public void run() {
        synchronized (Student2.class) {
            try {
                System.out.println("TestdeadBlock2 vào Student2");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Student.class) {
                System.out.println("TestdeadBlock2 vào Student");
            }
        }
    }
}
