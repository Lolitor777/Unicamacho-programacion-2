package Trabajo1Corte1VectoresMatrices;

import java.util.Scanner;

public class MatricesEjercicio5 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int filas = 4;
        int columnas = 4;
        int suma = 0;
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Fila: " + (i + 1));

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Columna: " + (j + 1));
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t|\t");
                if (j == i){
                    suma += matriz[i][j];
                }
            }
            System.out.print("\n");
        }

        System.out.println("La suma de la diagonal principal es: " + suma);
    }
}
