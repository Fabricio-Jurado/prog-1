/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TrabajoPractico2;

/**
 *
 * @author PYC
 */
public class P2 {

// Suma de dos números enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Suma de dos números decimales
    public double sumar(double a, double b) {
        return a + b;
    }

    // Resta de dos números enteros
    public int restar(int a, int b) {
        return a - b;
    }

    // Resta de dos números decimales
    public double restar(double a, double b) {
        return a - b;
    }

    // Multiplicación de dos números enteros
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Multiplicación de dos números decimales
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // División de dos números enteros
    public int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
    }

    // División de dos números decimales
    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0.0;
        }
    }
}
