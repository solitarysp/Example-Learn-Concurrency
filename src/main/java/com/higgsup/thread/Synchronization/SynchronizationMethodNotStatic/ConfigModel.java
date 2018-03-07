package com.higgsup.thread.Synchronization.SynchronizationMethodNotStatic;/*
  By Chi Can Em  07-03-2018
 */

public class ConfigModel {
    private Config config=new Config();
    public void getConfig() {
        System.out.println(config.getNumber());
    }
}
