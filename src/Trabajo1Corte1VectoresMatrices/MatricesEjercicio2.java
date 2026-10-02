package Trabajo1Corte1VectoresMatrices;

import java.util.Scanner;

public class MatricesEjercicio2 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite el número de filas: ");
        int filas = sc.nextInt();

        System.out.print("Digite el número de columnas: ");
        int columnas = sc.nextInt();

        int suma = 0;
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Fila: " + (i + 1));

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Columna: " + (j + 1));
                matriz[i][j] = sc.nextInt();
                suma += matriz[i][j];
            }
        }

        System.out.println("La suma de todos los números de la matriz es: " + suma);

    }
}
