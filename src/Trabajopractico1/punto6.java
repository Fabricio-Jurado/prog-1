/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Trabajopractico1;

import java.util.Scanner;

public class punto6 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de triángulos (n): ");
        int n = scanner.nextInt();

        int equilateros = 0;
        int isosceles = 0;
        int escalenos = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\nTriángulo " + i);
            System.out.print("Ingrese el lado 1: ");
            double lado1 = scanner.nextDouble();
            System.out.print("Ingrese el lado 2: ");
            double lado2 = scanner.nextDouble();
            System.out.print("Ingrese el lado 3: ");
            double lado3 = scanner.nextDouble();

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Es un triángulo equilátero.");
                equilateros++;
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Es un triángulo isósceles.");
                isosceles++;
            } else {
                System.out.println("Es un triángulo escaleno.");
                escalenos++;
            }
        }

        System.out.println("\nCantidad de triángulos:");
        System.out.println("Equiláteros: " + equilateros);
        System.out.println("Isósceles: " + isosceles);
        System.out.println("Escalenos: " + escalenos);

        // Determinar el tipo de triángulo con menor cantidad
        if (equilateros <= isosceles && equilateros <= escalenos) {
            System.out.println("El tipo de triángulo con menor cantidad es equilátero.");
        } else if (isosceles <= escalenos) {
            System.out.println("El tipo de triángulo con menor cantidad es isósceles.");
        } else {
            System.out.println("El tipo de triángulo con menor cantidad es escaleno.");
        }
    }
}
