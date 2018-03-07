package com.higgsup.thread.exampleNotifyNotifyAll;/*
  By Chi Can Em  08-03-2018
 */

public class TraLoi implements Runnable {
    Chat chat;
    String[] cauTraLoi = {"tôi yêu bạn", "vì tôi yêu bạn"};

    public TraLoi(Chat chat) {
        this.chat = chat;
    }

    public void run() {
        for (int i = 0; i < cauTraLoi.length; i++) {
            chat.traLoi(cauTraLoi[i]);
        }
    }
}
