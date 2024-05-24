/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Trabajopractico1;

import java.util.Scanner;
/**
 *
 * @author PYC
 */
public class punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la nota del primer parcial:");
        double notaParcial1 = scanner.nextDouble();

        System.out.println("Ingresa la nota del segundo parcial:");
        double notaParcial2 = scanner.nextDouble();

        System.out.println("Ingresa la nota del tercer parcial:");
        double notaParcial3 = scanner.nextDouble();

        // Calcula el promedio
        double promedio = (notaParcial1 + notaParcial2 + notaParcial3) / 3;

        // Verifica si el alumno está promocionado
        if (promedio >= 8) {
            System.out.println("El alumno está promocionado.");
        } else {
            System.out.println("El alumno no está promocionado.");
        }
    }
}
    
    

