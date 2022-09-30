package threading;

import java.util.Scanner;

public class SomeTime {
    public static void main(String[] args) {
        Issue i=new Issue();
        Thread t1=new Thread(i,"Gajaraj");
        Thread t2=new Thread(i,"Prakash");
        Thread t3=new Thread(i,"Thivin");
        Thread t4=new Thread(i,"Kannan");
        t1.start();t2.start();t3.start();t4.start();
    }
}

class Issue implements Runnable{
    Scanner scan=new Scanner(System.in);
    @Override
    public void run() {
        System.out.println("Welcome to INOX "+Thread.currentThread().getName());
        synchronized (scan){
            System.out.println("Tell us no of tickets required "+Thread.currentThread().getName());
            int count=scan.nextInt();
            int payable=count*180;
            System.out.println("Please pay "+payable+" to book the tickets ");
            int userAmount=scan.nextInt();
            if(userAmount>=payable){
                if((userAmount-payable)>0){
                    try {
                        System.out.println("Please wait to get "+(userAmount-payable));
                        Thread.currentThread().sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Thread.currentThread().getName()+" Your "+count+" tickets has booked");
            }
            else{
                System.out.println("Insufficient amount to book "+count+" by "+Thread.currentThread().getName());
            }
        }
    }
}