import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*    //---EJERCICIO 1 ARRAYS---
        int[] vector = new int[14];
        int cont;

        cont = 0;

        Scanner teclado = new Scanner(System.in);

        for (int i=0; i< vector.length; i++){
            System.out.println("ingrese un numero: ");
            vector[i] = teclado.nextInt();
            System.out.println("Posicion: "+ i + " de: 14");

            if (vector[i] == 3){
                cont = cont + 1;
            }
        }

        System.out.println("La cantidad de veces que se cargo un 3 es: " + cont);*/




        /*//---EJERCICIO 2 ARRAYS---

        //objetivo: recorrer la matriz mientras que en la 4ta columna
        //se muestra las 3 notas del alumno y el promedio de dicho alumno.

        double[][] matriz = new double[4][4];

        double acum;
        double promedio;

        Scanner teclado = new Scanner(System.in);

        //MATRIZ
        for (int f = 0; f < 4; f++){

            acum = 0;
            promedio = 0.0;

            for (int c = 0; c < 4; c++){

                if (c != 3) {
                System.out.println("Ingrese nota Nº: " + c + " del alumno Nº: " + f );
                matriz[f][c] = teclado.nextDouble();
                acum = acum + matriz[f][c];
                }

                if (c == 3){
                    promedio = acum / 3.0;
                    System.out.println("\nEl promedio del alumno Nº: " + f + " es: " + promedio + "\n");

                }
            }


        }*/




        /*//---EJERCICIO 4 ARRAYS---
        // 3 vectores
        //nombre - temperatura minima - temp maxima

        //variables necesarias

        String nombreTempMin;
        String nombreTempMax;
        double mayor;
        double menor;

        mayor = 0.00;
        menor = 999999.99;
        nombreTempMin = "";
        nombreTempMax = "";

        //creamos los 3 vectores
        String[] ciudades = new String[5];
        double[] tempMin = new double[5];
        double[] tempMax = new double[5];


        //cargamos los vectores
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Scanner teclado3 = new Scanner(System.in);

        for (int i=0; i < ciudades.length; i++){
            System.out.println("Ingrese el nombre de la ciudad " + i + ": ");
            ciudades[i] = teclado.next();

            System.out.println("Ingrese la temperatura minima de la ciudad " + i + ": ");
            tempMin[i] = teclado2.nextInt();

            System.out.println("Ingrese la temperatura maxima de la ciudad " + i + ": ");
            tempMax[i] = teclado3.nextInt();

            if (tempMin[i] < menor){
                menor = tempMin[i];
                nombreTempMin = ciudades[i];
            }
            if (tempMax[i] > mayor){
                mayor = tempMax[i];
                nombreTempMax = ciudades[i];
            }

        }

        System.out.println("\nLa ciudad con menor temperatura es: "+ nombreTempMin+ " con una " +
                "temperatura de: "+ menor);
        System.out.println("La ciudad con mayor temperatura es: "+ nombreTempMax+ " con una " +
                "temperatura de: "+ mayor);*/




        /*//---EJERCICIO 5 ARRAYS---
        //Objetivo: Rellenar matriz con numeros 5

        //creacion de matriz
        int[][] matriz = new int[4][5];

        //Recorrer matriz y guardar datos
        for (int f=0; f<4; f++){
            for (int c=0; c<5; c++){

                matriz[f][c] = 5;//Significa: que en la fila que estoy y en la columna que estoy agregale un 5.
            }
        }

        //Mostrar por pantalla
        for (int f=0; f<4; f++){
            System.out.printf("[");
            for (int c=0; c<5; c++){
                System.out.printf(" "+ matriz[f][c]+" ");
            }
            System.out.printf("]\n");
        }
         */



        //---EJERCICIO 6Ultimo ARRAYS---

        //Pasos: Primero crear el guardado de asientos con la variable bandera o flag
        //2_ crear ingresos por teclado para q el usuario compre el pasaje
        //3_ hacer funcion q checkee si hay asientos disponibles

        //creacion Matriz
        int[][] vuelos = new int[6][3];

        //Variables
        String bandera;
        int localidad;
        int horario;
        int asientos;


        //Asignacion de variables
        bandera = "";
        localidad = 0;
        horario = 0;
        asientos = 0;

        //Scanners
        Scanner teclado = new Scanner(System.in);


        //main
        for (int f=0; f<6; f++){
            for (int c=0; c<3; c++){
                System.out.println("Ingrese la cantidad de asientos para el destino: "+ f +" en el" +
                        " horario: "+ c);
                vuelos[f][c] = teclado.nextInt();

            }
        }

        Scanner teclado2 = new Scanner(System.in);//localidad
        Scanner teclado3 = new Scanner(System.in);//horario
        Scanner teclado4 = new Scanner(System.in);//asientos
        Scanner teclado5 = new Scanner(System.in);

        while(!bandera.equalsIgnoreCase("finish")){

            System.out.println("\n --Menu para reserva de Asientos-- \n");
            System.out.println("Ingrese el numero del Destino: ");
            localidad = teclado2.nextInt();
            System.out.println("Ingrese numero de horario: ");
            horario = teclado3.nextInt();
            System.out.println("Ingrese cantidad de asientos: ");
            asientos = teclado4.nextInt();

            if (vuelos[localidad][horario] >= asientos) {
                vuelos[localidad][horario] = vuelos[localidad][horario] - asientos;
                System.out.println("La reserva fue realizada con exito!");
            }
            else{
                System.out.println("La reserva no se pudo realizar, no quedan asientos.");
            }

            System.out.println("Quieres realizar otra compra?, si no es asi ingrese " +
                    "finish para terminar. o cualquier valor para seguir");
            bandera = teclado5.next();

        }














    }
}