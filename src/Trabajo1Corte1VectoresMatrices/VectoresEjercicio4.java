package Trabajo1Corte1VectoresMatrices;

import java.util.Scanner;

public class VectoresEjercicio4 {
    static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite la cantidad de dígitos que tendrá el vector: ");
        int cantidadDigitos = sc.nextInt();

        int pares = 0, impares = 0;
        int[] vector = new int[cantidadDigitos];

        for (int i = 0; i < vector.length; i++) {

            System.out.println("Dígito " + (i + 1) + ": ");
            int aux = sc.nextInt();
            vector[i] = aux;

            if ((aux % 2)  == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}
