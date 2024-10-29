Esta actividad pretende adentrarse en el mundo de la programación multihilo creando diferentes hilos para que cooperen entre sí. 
Tenemos una lista de todas las temperaturas máximas que se han producido cada día en Compostela en los últimos 10 años. 
Las tenemos almacenadas en un array de enteros.

Queremos calcular la temperatura media de los últimos 10 años. 
Para ello primero simularemos las temperaturas llenando un array de 3650 posiciones aleatoriamente
con números enteros, tomando valores entre -30 y 50.
Para calcular la temperatura media, dividiremos la matriz en 10 partes. 

Cada hilo tendrá que buscar dentro del trozo de array asignado la suma de temperaturas.
Finalmente, una vez encontrada la suma de cada subconjunto del array,
el programa nos dirá cuál es la media de las sumas devueltas por cada hilo.
