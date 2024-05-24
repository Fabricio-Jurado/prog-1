package TrabajoPractico3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PYC
 */
public class CalculadoradeEfiienciaEnergetica {
    public static void main(String[] args) {
        // Consumo de electricidad de cada electrodoméstico inteligente en kWh por mes
        ArrayList<Double> consumos = new ArrayList<>();
        consumos.add(90.0);
        consumos.add(40.0);
        consumos.add(50.0);
        consumos.add(35.0);

        // Reducción de consumo de electricidad en porcentaje
        double reduccionConsumo = 0.30;

        // Calcular el ahorro de energía anual en kWh
        double ahorroAnual = calcularAhorroAnual(consumos, reduccionConsumo);

        // Mostrar el ahorro de energía anual
        System.out.println("El ahorro de energía anual es: " + ahorroAnual + " kWh");

        // Determinar el máximo y el mínimo consumo de energía entre los electrodomésticos
        double maxConsumo = Collections.max(consumos);
        double minConsumo = Collections.min(consumos);

        // Mostrar el máximo y el mínimo consumo de energía
        System.out.println("El máximo consumo de energía es: " + maxConsumo + " kWh");
        System.out.println("El mínimo consumo de energía es: " + minConsumo + " kWh");
    }

    // Método para calcular el ahorro de energía anual en kWh
    public static double calcularAhorroAnual(ArrayList<Double> consumos, double reduccionConsumo) {
        double ahorroTotal = 0;
        for (double consumo : consumos) {
            double ahorroMensual = consumo * reduccionConsumo;
            ahorroTotal += ahorroMensual;
        }
        // Calcular el ahorro anual suponiendo 12 meses
        return ahorroTotal * 12;
    }
}