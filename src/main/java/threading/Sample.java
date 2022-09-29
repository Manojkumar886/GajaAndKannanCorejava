package threading;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        Binary bin=new Binary();
        Thread t1=new Thread(bin,"Gesnu");
        Thread t2=new Thread(bin,"Prabakar");
        Thread t3=new Thread(bin,"Vikas");
        //t3.setPriority(1);
        Thread t4=new Thread(bin,"Balaji");
        t1.start();t2.start();t3.start();t4.start();
    }
}

class Binary implements Runnable{
    synchronized public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());
        listing();
        selection();
        listing();
    }
    private int[] arr={34,90,556,23,67,35,78,33,2,34};
    public void listing(){
        System.out.println(Thread.currentThread().getName()+" listing"+Arrays.toString(arr));
    }
    public void selection(){
        System.out.println(Thread.currentThread().getName()+" has ready to sort");
        for(int hold=0;hold<arr.length;hold++){
            for(int comp=hold+1;comp<arr.length;comp++){
                if(arr[hold]>arr[comp]){
                    arr[hold]^=arr[comp];
                    arr[comp]^=arr[hold];
                    arr[hold]^=arr[comp];
                }
            }
        }
    }
}
