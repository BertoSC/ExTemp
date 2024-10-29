package org.example;

public class RunnableTemp implements Runnable{
    int [] temperatures;
    int sum;
    int inicio;
    int fin;



    public RunnableTemp(int [] temperatures, int inicio, int fin) {
        this.temperatures = temperatures;
        this.inicio=inicio;
        this.fin=fin;
    }

    @Override
    public void run() {
        suma();
    }

    public void suma () {
        for (int t=inicio; t<fin; t++) {
            sum += temperatures[t];
        }
    }

    public int getSuma () {
            return sum;

        }

}
