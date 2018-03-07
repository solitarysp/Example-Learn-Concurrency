package com.higgsup.thread.StopThread;/*
  By Chi Can Em  04-03-2018
 */

public class StopThreadSynchronized {
    private static boolean stopRequested;

    public static synchronized boolean isStopRequested() {
        return stopRequested;
    }

    public static synchronized void setTrueStopRequested() {
        StopThreadSynchronized.stopRequested = true;
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                // nếu nó bằng false thì sẽ tiếp tục chạy,
                while (!isStopRequested()) {
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
            setTrueStopRequested();
            System.out.println(thread.getState());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
