package Taller_Bucles_For_While_Programacion_II_UNIAJC;

import java.util.Scanner;

public class EjercicioB1 {
    static void main() {
        
        Scanner sc = new Scanner(System.in);

        int codigoUsuario;
        int digitoMayor = 0;
        int cantidadDigitos = 0;
        int sumaDigitos = 0;
        int aux = 0;
        double codigoInvertido = 0;
        boolean capicua = false;
        int intentos = 3;

        System.out.print("Por favor digite el código numérico: ");
        codigoUsuario = sc.nextInt();

        while (intentos > 0) {
        System.out.println("Intentos restantes: " + intentos);

        System.out.println("Por favor ingrese un numero mayor a 0: ");
        int aux1 = sc.nextInt();

        if (aux1 != 0) {
        codigoUsuario = aux1;
        break;
        } else {
        intentos--;
        }
        }

        if (intentos == 0) {
        System.out.println("Intentos agotados, en otra ocasión será");
        return;
        }

        aux = codigoUsuario;

        while (aux != 0) {

        int ultimoDigito = (int) aux % 10;

        cantidadDigitos++;
        sumaDigitos += ultimoDigito;

        if (ultimoDigito > digitoMayor) {
        digitoMayor = ultimoDigito;
        }

        codigoInvertido = (codigoInvertido * 10) + ultimoDigito;
        aux /= 10;
        }

        capicua = (codigoUsuario == codigoInvertido);
        String confirmacionCapicua = capicua ? "Si" : "No";

        System.out.print("Cantidad de dígitos ingresados: " + cantidadDigitos +
        "\n");
        System.out.print("Suma de todos los dígitos: " + sumaDigitos + "\n");
        System.out.print("El dígito mayor ingresado fue: " + digitoMayor + "\n");
        System.out.print("El numero es capicúa: " + confirmacionCapicua + "\n");

        // Analisis: El ciclo debe ser while porque no se sabe cual es el numero exacto
        // de repeticiones que se va a ejecutar.
        // El número de iteraciones que realiza el algoritmo depende del número de
        // dígitos que sea ingresado por el usuario en
        // el radicado, por lo tanto, ese apartado es incierto.
        // Si el usuario ingresa 0, el resultado en general será 0 y el numero será
        // considerado como capicúa, Por lo tanto,
        // implementé un while que pide números mayores a 0 teniendo como máximo 3
        // intentos, de lo contrario, se cerrará el programa.
    }
    
}
