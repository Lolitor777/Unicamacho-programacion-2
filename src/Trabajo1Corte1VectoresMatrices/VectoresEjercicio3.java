package Trabajo1Corte1VectoresMatrices;

import java.util.Scanner;

public class VectoresEjercicio3 {
    static void main(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite la cantidad de dígitos que tendrá el vector: ");
        int cantidadDigitos = sc.nextInt();

        int mayor = 0, menor = 0;
        int[] vector = new int[cantidadDigitos];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Dígito " + (i + 1) + ": ");
            int aux = sc.nextInt();
            vector[i] = aux;

            if (aux > mayor) {
                mayor = aux;
            }

            if (aux < menor || menor == 0){
                menor = aux;
            }
        }

        System.out.println("Número menor del arreglo: " + menor);
        System.out.println("Número mayor del arreglo: " + mayor);
    }
}
