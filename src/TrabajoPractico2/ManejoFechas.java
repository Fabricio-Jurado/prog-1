/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TrabajoPractico2;

/**
 *
 * @author PYC
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ManejoFechas {
    public static void main(String[] args) {
        // Ejemplo de uso
        int dia = 12;
        int mes = 10;
        int anio = 1492;

        // Calcular días transcurridos desde la fecha ingresada hasta hoy
        LocalDate fechaIngresada = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        long diasTranscurridos = ChronoUnit.DAYS.between(fechaIngresada, fechaActual);

        System.out.println("Días transcurridos desde la fecha ingresada: " + diasTranscurridos);

        // Verificar si el año ingresado es bisiesto
        boolean esBisiesto = fechaIngresada.isLeapYear();
        System.out.println("¿El año " + anio + " es bisiesto? " + esBisiesto);
    }

    // Método para calcular días transcurridos a partir de una fecha en formato "dd/mm/yyyy"
    public static long calcularDiasTranscurridos(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaIngresada = LocalDate.parse(fecha, formatter);
        LocalDate fechaActual = LocalDate.now();
        return ChronoUnit.DAYS.between(fechaIngresada, fechaActual);
    }
}
