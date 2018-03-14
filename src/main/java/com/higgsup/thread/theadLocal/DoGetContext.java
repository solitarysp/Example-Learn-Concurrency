package com.higgsup.thread.theadLocal;/*
  By Chi Can Em  15-03-2018
 */

public class DoGetContext {
    public void getContext() {
        Context context = (Context) MyThreadLocal.getThreadLocal().get();
        System.out.println(context.getId());
    }
}
