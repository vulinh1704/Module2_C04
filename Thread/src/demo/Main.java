package demo;//package demo;
//// implements Runnable
//class MyTask extends Thread {
//    private String name;
//    private int times;
//
//    MyTask(String name, int times) {
//        this.name = name;
//        this.times = times;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < times; i++) {
//            System.out.println(name);
//        }
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) throws InterruptedException {
//        // Thường
////        MyTask myTask =  new MyTask("A", 10);
////        MyTask myTask1 = new MyTask("B", 12);
////        myTask.run();
////        myTask1.run();
//
//        // implements Runnable
////        Runnable task1 = new MyTask("A", 50);
////        Runnable task2 = new MyTask("B", 52);
////        Thread thread1 = new Thread(task1);
////        Thread thread2 = new Thread(task2);
////        thread1.start();
////        thread2.start();
//
//        // extends Thread
//        MyTask myTask = new MyTask("A", 20);
//        MyTask myTask1 = new MyTask("B____", 12);
//        myTask.start();
//        myTask1.start();
//        Thread.sleep(5000);
//    }
//}


class AccountBank {
    public int amount;
    public String name;

    AccountBank(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public synchronized void withDraw(int moneyNumber) {
        if (moneyNumber > amount) {
            System.out.println("Hết tiền");
        } else {
            try {
                Thread.sleep(1000);
                this.amount = this.amount - moneyNumber;
                System.out.println(this.amount);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WithDrawTask extends Thread {
    AccountBank accountBank;

    WithDrawTask(AccountBank accountBank) {
        this.accountBank = accountBank;
    }

    public void run() {
        this.accountBank.withDraw(10);
    }
}

public class Main {
    public static void main(String[] args) {
        AccountBank accountBank = new AccountBank(16, "Quang senpai");
        WithDrawTask rutTienHaNoi = new WithDrawTask(accountBank);
        WithDrawTask rutTienBinhDuong = new WithDrawTask(accountBank);
        rutTienBinhDuong.start();
        rutTienHaNoi.start();

    }
}
