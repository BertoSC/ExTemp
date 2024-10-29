package org.example;

import java.util.concurrent.Callable;

public class GreetCallable implements Callable {
    private String nom;
    public GreetCallable(String nom){
        this.nom=nom;
    }

    @Override
    public Object call() throws Exception {
        String res = "Hello "+nom+"!";
        return res;
    }
}
