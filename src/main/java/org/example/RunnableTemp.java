package org.example;

public class RunnableTemp implements Runnable{
    int [] temperatures;
    int sum;

    public RunnableTemp(int [] temperatures) {
        this.temperatures = temperatures;
    }

    @Override
    public void run() {
        suma(temperatures);
    }

    public int suma (int [] i){
        for (int t:temperatures){
            sum+=t;
        }

        return sum;

    }
}
