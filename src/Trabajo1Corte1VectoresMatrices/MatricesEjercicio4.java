package Trabajo1Corte1VectoresMatrices;

import java.util.Scanner;

public class MatricesEjercicio4 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite el número de filas: ");
        int filas = sc.nextInt();

        System.out.print("Digite el número de columnas: ");
        int columnas = sc.nextInt();

        int valor = 0;
        int posicionFila = 0;
        int posicionColumna = 0;
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Fila: " + (i + 1));

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Columna: " + (j + 1));
                int aux = sc.nextInt();
                matriz[i][j] = aux;

                if (aux > valor){
                    valor = aux;
                    posicionFila = (i + 1);
                    posicionColumna = (j + 1);
                }
            }
        }

        System.out.println("El dígito mayor de la matriz es: " + valor);
        System.out.println("Fila: " + posicionFila);
        System.out.println("Columna: " + posicionColumna);

    }
}

