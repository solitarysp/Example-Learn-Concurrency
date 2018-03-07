package com.higgsup.thread.Synchronization.SynchronizationMethodNotStatic;/*
  By Chi Can Em  05-03-2018
 */

public class Student extends Thread {
    private ConfigModel configModel;

    public ConfigModel getConfigModel() {
        return configModel;
    }

    public void setConfigModel(ConfigModel configModel) {
        this.configModel = configModel;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            configModel.getConfig();
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
