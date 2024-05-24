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
public class CalculadoraAreasPerimetros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Círculo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Triángulo");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularCirculo();
                    break;
                case 2:
                    calcularRectangulo();
                    break;
                case 3:
                    calcularCuadrado();
                    break;
                case 4:
                    calcularTriangulo();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo nuevamente.");
            }
        } while (opcion != 5);
    }

    private static void calcularCirculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimetro);
    }

    private static void calcularRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Área del rectángulo: " + area);
        System.out.println("Perímetro del rectángulo: " + perimetro);
    }

    private static void calcularCuadrado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el lado del cuadrado: ");
        double lado = scanner.nextDouble();

        double area = Math.pow(lado, 2);
        double perimetro = 4 * lado;

        System.out.println("Área del cuadrado: " + area);
        System.out.println("Perímetro del cuadrado: " + perimetro);
    }

    private static void calcularTriangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingresa la altura del triángulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        double perimetro = base + 2 * Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2));

        System.out.println("Área del triángulo: " + area);
        System.out.println("Perímetro del triángulo: " + perimetro);
    }
    }
