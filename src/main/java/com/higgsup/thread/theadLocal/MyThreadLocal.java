package com.higgsup.thread.theadLocal;/*
  By Chi Can Em  15-03-2018
 */

public class MyThreadLocal {
    private static final ThreadLocal THREAD_LOCAL = new ThreadLocal();

    public static ThreadLocal getThreadLocal() {
        return THREAD_LOCAL;
    }

    public static void setThreadLocal(Object o) {
        THREAD_LOCAL.set(o);
    }
}
