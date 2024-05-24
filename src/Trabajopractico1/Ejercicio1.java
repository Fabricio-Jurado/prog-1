/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajopractico1;

import java.util.Scanner;

/**
 *
 * @author PYC
 */
public class Ejercicio1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int calif =0;
       
       System.out.println("Ingrese la nota de la materia");
       calif = scanner.nextInt();
       
       if(calif < 4){
           System.out.println("Estas desaprobado");
       }else if(calif >4){
           System.out.println("Estas aprobado");
       }
       if (calif == 10){
           System.out.println("Eres un alumno sobresaliente");
       }
    }

}
