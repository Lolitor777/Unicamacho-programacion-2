package Taller_Bucles_For_While_Programacion_II_UNIAJC;

public class EjercicioB2 {

    static void main() {

        int posicion1 = 0, posicion2 = 0;
        boolean bandera = false, encontrado = false;
        int[] documentosInscritos = {
                7162731,
                1237712,
                7654321,
                1233123,
                3756473,
                7654321,
                7567388,
                8387578,
                8599839,
                7647389,
        };

        int ultimoDocumento = documentosInscritos[documentosInscritos.length - 1];

        while (!bandera) {
            for (int i = 0; i < documentosInscritos.length; i++) {

                for (int j = i + 1; j < documentosInscritos.length; j++) {
                    if (documentosInscritos[i] == documentosInscritos[j]) {
                        posicion1 = i;
                        posicion2 = j;
                        bandera = true;
                        encontrado = true;
                        break;
                    }
                }

                if (documentosInscritos[i] == ultimoDocumento) {
                    bandera = true;
                }
            }
        }

        if (encontrado) {
            System.out.println("Se encontró un documento duplicado");
            System.out.println("Número: " + documentosInscritos[posicion1]);
            System.out.println("Posiciones en el arreglo: " + posicion1 + " " +
                    posicion2);
        } else {
            System.out.println("No hay documentos duplicados!!");
        }

        // Analisis en el documento
    }
}
