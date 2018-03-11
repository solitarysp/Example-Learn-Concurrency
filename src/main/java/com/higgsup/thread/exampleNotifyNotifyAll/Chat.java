package com.higgsup.thread.exampleNotifyNotifyAll;/*
  By Chi Can Em  08-03-2018
 */

public class Chat {
    boolean check = false;

    public synchronized void hoi(String msg) {
        if (check) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        check = !check;
        notify();
    }

    public synchronized void traLoi(String msg) {
        if (!check) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        check = !check;
        notify();
    }
}
