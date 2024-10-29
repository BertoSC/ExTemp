package org.example;

public class GreetingMain {
    public static int NUM_THREADS = 8;
    public static void main(String[] args) {

        String [] names = {"Pepe", "manolo", "benito", "alicia", "papilla", "medaigual", "otromás", "venga"};

        for (int i= 0; i<NUM_THREADS; i++){
            Runnable gr = new RunnableGreet(names [i]);
            Thread temp = new Thread(gr);
            temp.start();
        }
    }
}
