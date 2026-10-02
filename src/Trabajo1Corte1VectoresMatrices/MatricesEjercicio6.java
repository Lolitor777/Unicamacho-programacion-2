package Trabajo1Corte1VectoresMatrices;

import java.util.Scanner;

public class MatricesEjercicio6 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite el número de filas: ");
        int filas = sc.nextInt();

        System.out.print("Digite el número de columnas: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];
        int[][] matrizInversa = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Fila: " + (i + 1));

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Columna: " + (j + 1));
                int aux = sc.nextInt();
                matriz[i][j] = aux;
                matrizInversa[j][i] = aux;
            }
        }

        System.out.println("Matriz original");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] +  "\t|\t");
            }
            System.out.print("\n");
        }

        System.out.println("Matriz inversa");
        for (int i = 0; i < matrizInversa.length; i++) {

            for (int j = 0; j < matrizInversa[i].length; j++) {
                System.out.print(matrizInversa[i][j] +  "\t|\t");
            }
            System.out.print("\n");
        }
    }
}
