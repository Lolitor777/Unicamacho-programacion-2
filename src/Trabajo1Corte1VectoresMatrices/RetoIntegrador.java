package Trabajo1Corte1VectoresMatrices;

import java.util.Scanner;

public class RetoIntegrador {
    static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite el número de estudiantes: ");
        int estudiantes = sc.nextInt();
        estudiantes++;

        System.out.print("Digite el número de materias: ");
        int materias = sc.nextInt();
        materias++;

        String[][] salon = new String[estudiantes][materias];

        salon[0][0] = "Estudiantes";

        for (int i = 1; i < materias; i++) {
            System.out.println("Nombre de la materia " + i);
            salon[0][i] = sc.next();
        }

        for (int i = 1; i < estudiantes; i++) {
            System.out.println("Nombre de estudiante " + i);
            salon[i][0] = sc.next();

            for (int j = 1; j <= salon[i].length; j++) {
                salon[i][j] = "0";
            }
        }

        for (int i = 0; i < salon.length; i++) {
            for (int j = 0; j < salon[i].length; j++) {
                System.out.printf("%-18s", salon[i][j]);
            }
            System.out.print("\n");
        }
    }

}
