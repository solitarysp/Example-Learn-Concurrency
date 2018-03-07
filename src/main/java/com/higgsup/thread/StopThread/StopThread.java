package com.higgsup.thread.StopThread;/*
  By Chi Can Em  04-03-2018
 */

public class StopThread {
    //tạo 1 boolean để check
    private static boolean stopRequested;

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                // nếu nó bằng false thì sẽ tiếp tục chạy,
                while (!stopRequested) {
                    System.out.println(++i);
                }
            }
        });
        System.out.println(thread.getState());
        thread.start();
        try {
            System.out.println(thread.getState());
            Thread.sleep(1000);
            // set bằng tre để stop thread
            stopRequested = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
