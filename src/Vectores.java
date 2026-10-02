import java.util.Scanner;

public class Vectores {
    static void main(){

        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int [][] numeros = new int[3][4];

        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Digite el numero de la columna " + (j + 1) + " de la fila " + (i + 1));
                numeros[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < 1; j++) {
                suma += numeros[i][j];
            }
        }

        System.out.println("Sumatoria: " + suma);

    }
}
