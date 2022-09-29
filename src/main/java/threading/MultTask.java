package threading;

import java.util.Scanner;

public class MultTask {
    public static void main(String[] args) {
        MySearch search=new MySearch();
        MyChange change=new MyChange();

        Thread t1=new Thread(search,"Gajaraj");
        Thread t2=new Thread(search,"Mohan");
        Thread t3=new Thread(change,"Sabari");
        Thread t4=new Thread(change,"Razak");
        t1.start();t2.start();
        //t3.start();t4.start();


    }
}

class MyChange extends MyCrew implements Runnable{

    @Override
    public void run() {
        System.out.println("Welcome "+Thread.currentThread().getName());
        if(Thread.currentThread().getName().equalsIgnoreCase("Sabari")){
            for(String[] row:crew){
                for(String each:row){
                    if(each.startsWith("A")||each.startsWith("E")||each.startsWith("I")||each.startsWith("O")||
                            each.startsWith("U")){
                        System.out.print(each+" ");
                    }
                }
            }
            System.out.println();
        }
        else{
            for(String[] row:crew){
                for(String each:row){
                    if(each.endsWith("a")||each.endsWith("e")||each.endsWith("i")||each.endsWith("o")||
                            each.startsWith("u")){
                        System.out.print(each);
                    }
                }
            }
            System.out.println();
        }
    }
}

class MySearch extends MyCrew implements Runnable{

    Scanner scan=new Scanner(System.in);

    public void linear(String data){
        for(int row=0;row<crew.length;row++){
            for(int col=0;col<crew[row].length;col++){
                if(crew[row][col].equalsIgnoreCase(data)){
                    System.out.println(data+" exists @ row "+row+" col "+col+" by "+Thread.currentThread().getName());
                    return;
                }
            }
        }
        System.out.println(data+" not found anywhere "+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("Greetings to "+Thread.currentThread().getName());
        System.out.println("Tell us desired data to find its position ");
        synchronized (scan){
            String users=scan.next();
            linear(users);
        }
    }
}

class MyCrew{
    String[][] crew={{"Titus","Maheshwaran"},{"Sobin","Aasaithambi","Rakshan"},{"Vijaya","Murali","Karthiya","Murugan"}};
    public void view(){
        for(String[] row:crew){
            for(String each:row){
                System.out.print(each+" ");
            }
            System.out.println();
        }
    }
}
