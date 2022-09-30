package threading;

import java.util.Scanner;

public class Interactions {
    public static void main(String[] args) {
        ATM a=new ATM();
        CDM c=new CDM(a);
        Thread t1=new Thread(a,"Gajaraj");
        Thread t2=new Thread(c,"Manoj");
        t1.start();
        t2.start();
    }
}

class CDM implements Runnable{
    ATM tmp;

    public CDM(){
        System.out.println("Default");
    }
    public CDM(ATM t){
        tmp=t;
    }

    int deposited=10000;
    int userAmount;
    Scanner scan=new Scanner(System.in);
    @Override
    public void run() {
            synchronized (tmp.scanner){
                System.out.println("Enter the amount to deposit "+Thread.currentThread().getName());
                userAmount=scan.nextInt();
                if(tmp.userRequired>tmp.available){
                    tmp.available+=userAmount;
                    System.out.println(Thread.currentThread().getName()+" deposited to another machine for help");
                    tmp.scanner.notify();
                }
                else{
                    deposited+=userAmount;
                }
                System.out.println(userAmount+" has deposited successfully by "+Thread.currentThread().getName());
            }
    }
}

class ATM implements Runnable{

    int available=50000;
    int userRequired;
    Scanner scanner=new Scanner(System.in);

    @Override
    public void run() {
        synchronized (scanner){
            System.out.println("Welcome to ICICI bank ATM  "+Thread.currentThread().getName());
            System.out.println("Enter the required amount ");
            userRequired= scanner.nextInt();
            if(userRequired>available){
                try {
                    scanner.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            available-=userRequired;
            System.out.println("Withdraw success for the amount of "+userRequired+" by "+Thread.currentThread().getName());
            System.out.println("After withdrawn available balance in machine "+available);
        }
    }
}