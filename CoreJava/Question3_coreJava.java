import java.io.*;

class Fetch extends Thread{
    public void run(){
        fetchData();
        }

    void fetchData() {
        try {
            System.out.print("Fetching data");
            Thread.sleep(5000);
            System.out.println("\nDone!");
        } catch (Exception e) {
            System.out.println("\nTHREAD WAS INTERRUPTED!");
        }
    }
}

class Process implements Runnable{
    public void run(){
        processData();
    }

    void processData() {
        try {
            System.out.print("Processing data");
            Thread.sleep(5000);
            System.out.println("\nDone!");
        } catch (Exception e) {
            System.out.println("\nTHREAD WAS INTERRUPTED!");
        }
    }
}

public class Question3_coreJava{
    public static void main(String[] args){
        Fetch fetch = new Fetch();
        Process process = new Process();
        Thread thread = new Thread(process);

        try {            
            fetch.start();
            fetch.join();
            thread.start();
        } catch (InterruptedException e) {
            System.out.println("\nTHREADS WERE INTERRUPTED!");
        }
    }
}