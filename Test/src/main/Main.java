package main;

class Account {
    private String name;
    private int amount;

    public Account(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public synchronized void withDraw(int a) throws InterruptedException {
        if(this.amount >= a) {
            Thread.sleep(1000);
            this.amount = this.amount - a;
            System.out.println(this.amount);
        } else {
            System.out.println("NOT ENOUGH MONEY");
        }
    }
}

class WithDrawTask implements Runnable {
    private Account account;
    public WithDrawTask(Account acc) {
        this.account = acc;
    }

    @Override
    public void run() {
        try {
            this.account.withDraw(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Main {
    public static void main(String[] args) {
        Account account = new Account("A", 16);
        Runnable task1 = new WithDrawTask(account);
        Thread t1 = new Thread(task1);
        Runnable task2 = new WithDrawTask(account);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
    }
}