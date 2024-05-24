/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TrabajoPractico3;

/**
 *
 * @author PYC
 */
public class CalculodeInteresCompuesto {

   public static void main(String[] args) {
        double principal = 10000; // Monto principal
        double tasaInteresAnual = 0.06; // Tasa de interés anual (6%)
        int tiempoEnAnios = 5; // Tiempo en años
        int capitalizacionesPorAnio = 12; // Capitalizaciones mensuales

        // Cálculo del interés compuesto
        double factor = 1 + (tasaInteresAnual / capitalizacionesPorAnio);
        double exponente = capitalizacionesPorAnio * tiempoEnAnios;
        double montoFinal = principal * Math.pow(factor, exponente);
        double interesCompuesto = montoFinal - principal;

        System.out.println("Inversión inicial: $" + principal);
        System.out.println("Interés compuesto después de " + tiempoEnAnios + " años: $" + interesCompuesto);
        System.out.println("Valor futuro después de " + tiempoEnAnios + " años: $" + montoFinal);
    }

    
}
