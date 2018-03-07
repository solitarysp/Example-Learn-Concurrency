package com.higgsup.thread.exampleNotifyNotifyAll;/*
  By Chi Can Em  08-03-2018
 */

public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat();
        Hoi hoi1 = new Hoi(chat);
        TraLoi traLoi = new TraLoi(chat);
        Thread threadHoi = new Thread(hoi1);
        Thread threadTraLoi = new Thread(traLoi);
        threadHoi.start();
        threadTraLoi.start();
    }
}
