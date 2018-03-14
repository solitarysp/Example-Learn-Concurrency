package com.higgsup.thread.theadLocal;/*
  By Chi Can Em  15-03-2018
 */

public class MainTestThreadLocal extends Thread {
    @Override
    public void run() {
        Context context = new Context();
        context.setId(1);
        MyThreadLocal.setThreadLocal(context);
        DoGetContext doGetContext=new DoGetContext();
        doGetContext.getContext();
    }

    public static void main(String[] args) {
    Thread thread=new Thread(new MainTestThreadLocal());
    Thread thread2=new Thread(new MainTestThreadLocal());
    thread.start();
    thread2.start();
    }
}
