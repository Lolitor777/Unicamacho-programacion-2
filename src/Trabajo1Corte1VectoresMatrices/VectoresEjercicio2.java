package Trabajo1Corte1VectoresMatrices;

import java.util.Scanner;

public class VectoresEjercicio2 {
    static void main(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite la cantidad de dígitos que tendrá el vector: ");
        int cantidadDigitos = sc.nextInt();

        double suma = 0;
        double[] vector = new double[cantidadDigitos];

        for (int i = 0; i < vector.length; i++) {
            
            System.out.println("Dígito " + (i + 1) + ": ");
            double aux = sc.nextDouble();
            vector[i] = aux;
            suma += aux;
        }

        System.out.println("La suma de todos los elementos es: " + suma);
        System.out.println("El promedio de todos los elementos es: " + (suma / vector.length));

    }
}
