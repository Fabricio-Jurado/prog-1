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
public class punto4 {
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, año;

        System.out.print("Ingrese el dia: ");
        dia = entrada.nextInt();
        System.out.print("Ingrese el mes: ");
        mes = entrada.nextInt();
        System.out.print("Ingrese el ano: ");
        año = entrada.nextInt();

        if (dia < 1 || mes < 1 || mes > 12 || año < 1) {
            System.out.println("La fecha ingresada no es válida.");
            return;
        }

        int trimestre = (mes - 1) / 3 + 1;
        System.out.print("La fecha ingresada corresponde al ");
        switch (trimestre) {
            case 1:
                System.out.println("primer trimestre del año.");
                break;
            case 2:
                System.out.println("segundo trimestre del año.");
                break;
            case 3:
                System.out.println("tercer trimestre del año.");
                break;
            case 4:
                System.out.println("cuarto trimestre del año.");
                break;
            default:
                System.out.println("trimestre no válido.");
        }
    }
}