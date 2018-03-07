package com.higgsup.thread.Synchronization.SynchronizationMethodNotStatic;/*
  By Chi Can Em  07-03-2018
 */

public final class Config {
    private int number = 0;

    public synchronized int getNumber() {
        return number++;
    }

}
