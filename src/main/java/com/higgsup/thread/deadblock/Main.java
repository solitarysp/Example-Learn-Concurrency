package com.higgsup.thread.deadblock;/*
  By Chi Can Em  11-03-2018
 */

public class Main {
    public static void main(String[] args) {
        TestdeadBlock testdeadBlock = new TestdeadBlock();
        TestdeadBlock2 testdeadBlock2 = new TestdeadBlock2();

        Thread thread = new Thread(testdeadBlock);
        Thread thread2 = new Thread(testdeadBlock2);
        thread.start();
        thread2.start();
    }
}
