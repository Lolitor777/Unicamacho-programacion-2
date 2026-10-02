package Trabajo1Corte1VectoresMatrices;

import java.util.Scanner;

public class VectoresEjercicio5 {
    static void main(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite la cantidad de elementos que tendrá el vector: ");
        int cantidadElementos = sc.nextInt();

        int posicion = 0;
        boolean bandera = false;
        int[] vector = new int[cantidadElementos];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }

        System.out.println("Digite el numero que desea encontrar en el arreglo");
        int numero = sc.nextInt();

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numero){
                posicion = (i + 1);
                bandera = true;
                break;
            }
        }

        if (bandera) {
            System.out.println("El número " + numero +  " fué encontrado con éxito en la posición " + posicion);
        }
        else {
            System.out.println("El número no fué encontrado");
        }
    }
}
