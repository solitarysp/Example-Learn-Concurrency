package com.higgsup.thread.exampleNotifyNotifyAll;/*
  By Chi Can Em  08-03-2018
 */

public class Hoi implements Runnable {
    Chat chat;
    String[] cauHoi = {"Bạn yêu tôi không", "vì sao yêu tôi"};

    public Hoi(Chat chat) {
        this.chat = chat;
    }

    public void run() {
        for (int i = 0; i < cauHoi.length; i++) {
            chat.hoi(cauHoi[i]);
        }
    }
}
