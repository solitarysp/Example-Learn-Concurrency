package com.higgsup.thread.volatileTest;/*
  By Chi Can Em  04-03-2018
 */

public class VolatileTest {
    private  static volatile int COUNT = 0;

    static class test extends Thread {

        int count = COUNT;

        public void run() {
            while (count < 5) {
                if (count != COUNT) {
                    System.out.println("Count variable changed to : " + COUNT+"biến cũ ="+count);
                    count = COUNT;
                }
            }
        }
    }

    static class test2 extends Thread {

        int count = COUNT;

        public void run() {
            while (COUNT  < 5) {
                COUNT = ++count;
                System.out.println("test2 " + count);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new test().start();
        new test2().start();
    }
}
