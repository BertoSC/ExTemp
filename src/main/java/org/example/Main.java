package org.example;

/*

Esta actividad pretende adentrarnos en el mundo de la programación multihilo creando diferentes hilos para que colaboren entre sí.
Tenemos una lista de todas las temperaturas máximas que se han producido cada día en Compostela en los últimos 10 años.
Las tenemos almacenadas en un array de enteros.Queremos calcular la temperatura media de los últimos 10 años.
Para ello primero simularemos las temperaturas llenando un array de 3650 posiciones aleatoriamente con números enteros,
tomando valores entre -30 y 50. Para calcular la temperatura media, dividiremos la matriz en 10 partes.
Cada hilo tendrá que buscar la temperatura media dentro del trozo de matriz asignado.
Finalmente, una vez encontrada la media de cada subconjunto del array,
el programa nos dirá cuál es la media de las medias devueltas por cada hilo.

*/

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rm = new Random();
        int [] temp = new int[3650];

        for (int i: temp){
            temp[i] = rm.nextInt(-30, 50);
        }

        int posIn=0;
        int posFin=364;

        int[] part = new int[365];

        for (int j = posIn; j < posFin; j++) {



        }

    }
}