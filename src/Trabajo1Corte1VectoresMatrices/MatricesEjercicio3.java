package Trabajo1Corte1VectoresMatrices;

import java.util.Scanner;

public class MatricesEjercicio3 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite el número de filas: ");
        int filas = sc.nextInt();

        System.out.print("Digite el número de columnas: ");
        int columnas = sc.nextInt();

        int sumaFila = 0;
        int sumaColumna = 0;
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
                System.out.print(matriz[i][j] +  "\t|\t");
                sumaFila += matriz[i][j];

                if (j == (matriz[i].length - 1)){
                    System.out.print("= " + sumaFila);
                    sumaFila = 0;
                }
            }
            System.out.print("\n");
        }

        for (int j = 0; j < columnas; j++) {

            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];

            }

            System.out.print("=" + sumaColumna + "\t\t");
            sumaColumna = 0;
        }

    }
}
