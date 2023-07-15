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




        //---EJERCICIO 1 ARRAYS---

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


        }






    }
}