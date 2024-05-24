/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Trabajopractico1;

import java.util.Scanner;

public class punto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de x: ");
        int x = scanner.nextInt();

        System.out.print("Ingrese el valor de y: ");
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("El punto está en el primer cuadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto está en el segundo cuadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto está en el tercer cuadrante.");
        } else if (x > 0 && y < 0) {
            System.out.println("El punto está en el cuarto cuadrante.");
        } else {
            System.out.println("El punto está en el origen (coordenadas x e y son cero).");
        }
    }
}

