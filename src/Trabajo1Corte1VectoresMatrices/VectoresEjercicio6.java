package Trabajo1Corte1VectoresMatrices;

import java.util.Scanner;

public class VectoresEjercicio6 {
    static void main(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite la cantidad de elementos que tendrá el vector: ");
        int cantidadElementos = sc.nextInt();

        int[] vector = new int[cantidadElementos];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }

        System.out.println("Arreglo ordenado: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + (i != (vector.length - 1) ? " - " : ""));
        }

        System.out.println("\nArreglo invertido: ");
        for (int i = (vector.length - 1); i >= 0; i--) {
            System.out.print(vector[i] + (i > 0 ? " - " : ""));
        }
    }
}
