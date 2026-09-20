package Taller_Bucles_For_While_Programacion_II_UNIAJC;

import java.util.Scanner;

public class EjercicioB4 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int opcion = 5;
        int hogar = 0;
        int racionesEntregadas = 0;
        int racionesDiarias = 200;
        int entregaMayor = 0;
        int entregaMenor = 10;
        int aux = 0;

        do {
            System.out.println("-----------------------------MENU-------------------------------");
            System.out.println("Por favor escriba el número de la acción que desee llevar a cabo");
            System.out.println("1. Registrar entrega.");
            System.out.println("2. Ver total y promedio de raciones por persona.");
            System.out.println("3. Ver la entrega mayor y menor.");
            System.out.println("4. Cerrar jornada.");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (racionesDiarias == 0) {
                        System.out.println("!!NO HAY RACIONES DISPONIBLES EN EL INVENTARIO!!");
                        break;
                    }
                    do {
                        System.out.println("Registre el número de raciones entregadas (entre 1 y 8) al hogar #"
                                + (hogar + 1)
                                + " de lo contrario esta opción se repetirá continuamente hasta obtener un valor válido.");

                        aux = sc.nextInt();

                        if (aux < 1 || aux > 8) {
                            System.out.println("!!Número inválido. Debe ser una cantidad entre 1 y 8!!");
                        }

                    } while (aux < 1 || aux > 8);

                    if (racionesDiarias < aux) {
                        System.out.println("El numero de raciones es insuficiente!!");
                    } else {
                        racionesEntregadas += aux;
                        racionesDiarias -= aux;
                        hogar++;
                    }

                    if (aux > entregaMayor) {
                        entregaMayor = aux;
                    }

                    if (aux < entregaMenor) {
                        entregaMenor = aux;
                    }

                    if (racionesDiarias < 20) {
                        System.out.println("La raciones se estan agotando!!");
                        System.out.println("Raciones diponibles: " + racionesDiarias);
                    }
                    break;

                case 2:
                    System.out.println("Total de raciones entregadas: " + racionesEntregadas);
                    System.out.println("Promedio de raciones: " + (racionesEntregadas / hogar));
                    break;

                case 3:
                    System.out.println("Entrega mayor: " + entregaMayor);
                    System.out.println("Entrega menor: " + entregaMenor);
                    break;

                case 4:
                    System.out.println("Se cierra la jornada!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor seleccione una opción entre 1 y 4.");
                    break;
            }

        } while (opcion != 4);

        // Analisis: La solución utiliza dos ciclos do-while: el primero gestiona la
        // repetición del menú principal y el
        // segundo valida que las raciones ingresadas estén en el rango de 1 a 8; ambos
        // se justifican porque
        // garantizan ejecutar la acción al menos una vez antes de verificar la
        // condición, evitando asignar valores
        // iniciales artificiales. Sin el ciclo de validación, el comedor sufriría
        // desabastecimiento, pues
        // un usuario podría ingresar valores erróneos, negativos o excesivos que
        // agotarían el inventario en un solo
        // hogar y distorsionarían por completo las estadísticas y el promedio diario.
    }
}
