package main;

import java.io.*;


class MyRun extends Thread {

    @Override
    public void run() {
        String str = "==0";
        for (int i = 0; i < 10; i++) {
            System.out.println("-----");
        }
    }
}

class MyRun2 extends Thread {

    @Override
    public void run() {
        String str = "1";
        for (int i = 0; i < 10; i++) {
            System.out.println("" + i);
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        MyRun myRun = new MyRun();
        MyRun2 myRun2 = new MyRun2();
        myRun.start();
        myRun2.start();
    }

}
