package trabajos;

import java.util.*;

public class practica2 {

    public static void main(String[] args) {

        Scanner captura = new Scanner(System.in);

        System.out.println("Ingresa el valor de x1:");
        float x1 = captura.nextFloat();

        System.out.println("Ingresa el valor de y1:");
        float y1 = captura.nextFloat();

        System.out.println("Ingresa el valor de x2:");
        float x2 = captura.nextFloat();

        System.out.println("Ingresa el valor de y2:");
        float y2 = captura.nextFloat();

        System.out.println("Ingresa el valor de x3:");
        float x3 = captura.nextFloat();

        System.out.println("Ingresa el valor de y3:");
        float y3 = captura.nextFloat();

        double ab = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double ac = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double bc = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));

        System.out.println("Medidas de los lados:");
        System.out.printf("AB: %.2f\n", ab);
        System.out.printf("AC: %.2f\n", ac);
        System.out.printf("BC: %.2f\n", bc);

        if (ab == ac && ab == bc) {
            System.out.println("Es un triángulo equilátero.");
        } else if (ab == ac || ab == bc || ac == bc) {
            System.out.println("Es un triángulo isósceles.");
        } else {
            System.out.println("Es un triángulo escaleno.");
        }

    }
}
