/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TrabajoPractico2;

import java.util.Scanner;

/**
 *
 * @author PYC
 */
public class P1 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del empleado: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();

        // Crear un objeto Empleado
        empleado empleado = new empleado(nombre, apellido, edad, salario);

        // Mostrar información completa (incluyendo salario)
        System.out.println("\nInformación completa del empleado (con salario):");
        empleado.mostrarInformacionCompleta(true);

        // Incrementar el salario
        empleado.incrementarSalario(1000); // Incremento fijo
        empleado.incrementarSalarioPorDesempeno(5); // Incremento del 5% por desempeño

        // Mostrar información completa nuevamente
        System.out.println("\nInformación actualizada del empleado (con salario):");
        empleado.mostrarInformacionCompleta(true);
    }
}