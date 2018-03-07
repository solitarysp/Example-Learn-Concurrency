package com.higgsup.thread.Synchronization;/*
  By Chi Can Em  05-03-2018
 */

public class Student extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            ConfigModel configModel = new ConfigModel();
            configModel.getConfig();
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
