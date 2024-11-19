package Ejercicio6;

public class Ejercicio6_2 {
    public static void ejemplo6() {
        System.out.println("Introduce un número entre 1 y 100: ");
        int num = Integer.parseInt(System.console().readLine()); // Número a adivinar
        int intentos = 5; // Máximo de intentos permitidos
        int rangoMaximo = (int) Math.ceil(Math.log(100) / Math.log(2)); // Logaritmo base 2
        int numaleatorio; // Número que el programa intenta adivinar
        int nummin = 1; // Límite inferior del rango
        int nummax = 100; // Límite superior del rango

        if (rangoMaximo <= intentos) {
            // Puede acertar seguro: aplica búsqueda binaria
            for (int i = 1; i <= intentos; i++) {
                numaleatorio = nummin + (nummax - nummin) / 2;
                System.out.println("Intento " + i + ": ¿Es " + numaleatorio + "?");

                if (num == numaleatorio) {
                    System.out.println("¡Felicidades! Has acertado.");
                    return;
                } else if (num > numaleatorio) {
                    System.out.println("El número que estoy pensando es mayor que " + numaleatorio);
                    nummin = numaleatorio + 1; // Actualiza el límite inferior
                } else {
                    System.out.println("El número que estoy pensando es menor que " + numaleatorio);
                    nummax = numaleatorio - 1; // Actualiza el límite superior
                }
            }
        } else {
            // No puede acertar seguro: elige aleatoriamente
            for (int i = 1; i <= intentos; i++) {
                numaleatorio = nummin + (int) (Math.random() * (nummax - nummin + 1));
                System.out.println("Intento " + i + ": ¿Es " + numaleatorio + "?");

                if (num == numaleatorio) {
                    System.out.println("¡Felicidades! Has acertado.");
                    return;
                } else if (num > numaleatorio) {
                    System.out.println("El número que estoy pensando es mayor que " + numaleatorio);
                    nummin = numaleatorio + 1;
                } else {
                    System.out.println("El número que estoy pensando es menor que " + numaleatorio);
                    nummax = numaleatorio - 1;
                }
            }
        }

        // Si no lo adivina en el número de intentos permitido
        System.out.println("Qué pena, no he acertado. El número era " + num);
    }
}
