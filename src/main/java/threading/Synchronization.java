package threading;

import java.util.Scanner;

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {


        Transaction trans=new Transaction();
        Thread t1=new Thread(trans,"Manikandan");
        Thread t2=new Thread(trans,"Mukesh");

        t1.start();
        t1.join();
        t2.start();
    }
}

class Account{
    private String holder;
    private long number;
    private double balance;

    @Override
    public String toString() {
        return "Account{" +
                "holder='" + holder + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }

    public Account() {
    }

    public Account(String holder, long number, double balance) {
        this.holder = holder;
        this.number = number;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class Transaction implements Runnable{

    Account[] base=new Account[2];
    public Transaction(){
        base[0]=new Account("Razak Mohamed",876545678L,2300.9);
        base[1]=new Account("Sheik",98767676777767L,147300.9);
    }

    int machineBalance=123000;

    Scanner scan=new Scanner(System.in);

    Account account;

    public void initialize(){
        System.out.println("Tell us account number ");
        long num=scan.nextLong();
        for(Account tmp:base){
            if(tmp.getNumber()==num){
                account=tmp;
                return;
            }
        }
        System.out.println("Invalid account");
        Thread.currentThread().stop();
    }

    @Override
    public void run() {
        System.out.println("Welcome to Zealous Bank ATM "+Thread.currentThread().getName());
        initialize();
        System.out.println("Enter the amount to withdraw ");
        int users=scan.nextInt();
        if(account.getBalance()>=users&&machineBalance>=users){
            account.setBalance(account.getBalance()-users);
            machineBalance-=users;
            System.out.println(users+" amount has withdrawn successfully by "+Thread.currentThread().getName()
                    +" from holder "+account.getHolder());
        }
        else{
            System.out.println("Unable to dispense amount "+users+" by "+Thread.currentThread().getName()+" from "+account.getHolder());
        }
        System.out.println(account);
    }
}

