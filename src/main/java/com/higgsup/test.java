package com.higgsup;/*
  By Chi Can Em  11-03-2018
 */

public class test {
    public static void main(String[] args) {
        String a = "*";
        String b = "**********";
        String c = "          ";
        String e = " ";
        String g = "*";
        for (int i = 0; i < 10; i++) {
            StringBuffer stringBuffer1 = new StringBuffer(b);
            StringBuffer stringBuffer2 = new StringBuffer(b);
            StringBuffer stringBuffer3 = new StringBuffer(c);
            System.out.println(a + c.substring(0, 10 - i) + stringBuffer1.replace(10 - i, 10, e) + stringBuffer2.replace(0, i, e)+stringBuffer3.replace(9-i, 10, g));
            a = a + "*";
            e = e + " ";
            g += "*";
        }
    }
}
