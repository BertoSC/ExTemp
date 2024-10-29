package org.example;

/*

Esta actividad pretende adentrarnos en el mundo de la programación multihilo creando diferentes hilos para que colaboren entre sí.
Tenemos una lista de todas las temperaturas máximas que se han producido cada día en Compostela en los últimos 10 años.
Las tenemos almacenadas en un array de enteros.Queremos calcular la temperatura media de los últimos 10 años.
Para ello primero simularemos las temperaturas llenando un array de 3650 posiciones aleatoriamente con números enteros,
tomando valores entre -30 y 50. Para calcular la temperatura media, dividiremos la matriz en 10 partes.
Cada hilo tendrá que buscar la temperatura media dentro del trozo de matriz asignado.
Finalmente, una vez encontrada la suma de cada subconjunto del array,
el programa nos dirá cuál es la media de las medias devueltas por cada hilo.

*/

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random rm = new Random();
        int[] temp = new int[3650];
        int suma = 0;

        // Llenar el array con valores aleatorios entre -30 y 50
        for (int i = 0; i < temp.length; i++) {
            temp[i] = rm.nextInt( - 30, 50); // Genera valores de -30 a 50
        }

        int numPartes = 10;
        int tamParte = temp.length / numPartes;
        Thread[] threads = new Thread[numPartes];
        RunnableTemp[] runnables = new RunnableTemp[numPartes];

        // Crear y iniciar hilos
        // Se calculan los índices en función del tamaño de cada parte del array principal
        int posIn = 0;
        int posFin = tamParte;
        for (int j = 0; j < numPartes; j++) {
            runnables[j] = new RunnableTemp(temp, posIn, posFin);
            threads[j] = new Thread(runnables[j]);
            threads[j].start();
            posIn = posIn + tamParte;
            posFin = posFin + tamParte;

        }

        // Esperar a que todos los hilos terminen
        // Es necesario hacerlo así para garantizar concurrencia
        // si se meten en el bucle anterior, sería secuencialidad

        for (int j = 0; j < numPartes; j++) {
            threads[j].join();
            suma += runnables[j].getSuma();
        }

        // Calcular la media de todas las temperaturas, formateada a dos decimales

        double media = (double) suma / temp.length;
        String finalMed = String.format("%.2f", media);
        System.out.println("La temperatura media de los últimos 10 años es: " + finalMed);
    }
}
