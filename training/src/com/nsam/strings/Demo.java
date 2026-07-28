package com.nsam.strings;

public class Demo {
    public static void main(String[] args) {
        Bank b=new Bank();
        System.out.println(b.acc_number);
        System.out.println(b.balance);
        b.setData(11111);
        System.out.println(b.getData());
    }
}
