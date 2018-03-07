package com.higgsup.thread.Synchronization;/*
  By Chi Can Em  07-03-2018
 */

public final class Config {
    private static int number = 0;

    public static synchronized int getNumber() {
        return number++;
    }

}
