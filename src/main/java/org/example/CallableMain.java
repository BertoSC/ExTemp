package org.example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableMain {
    public static void main(String[] args) {
        String [] names = {"Pepe", "manolo", "benito", "alicia", "papilla", "medaigual", "otromás", "venga"};

        Callable gt = new GreetCallable(names[0]);
        FutureTask ft = new FutureTask(gt);
        Thread th = new Thread(ft);
        th.start();
        try {
            String msg = (String) ft.get();
            System.out.println(msg);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
