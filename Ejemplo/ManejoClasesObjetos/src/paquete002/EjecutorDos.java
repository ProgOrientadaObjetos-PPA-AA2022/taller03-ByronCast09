/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;
import paquete001.FacturaTelefono;
/**
 *
 * @author SALA I
 */
public class EjecutorDos {
    public static void main(String[]args){
        FacturaTelefono telefono = new FacturaTelefono();
        
        ft.telefono.establecerNumeroTelefono(numeroTelefono);
        ft.telefono.establecerMinutoMes(0.20);
        ft.telefono.establecerValorMinuto(valorMinuto);
        
        telefono.calcularValorFactura();
        
        System.out.printf("Factura de Teléfono\n\n\tNúmero de teléfono: %s\n"
                + "Minutos mensuales: %.2f\n\tValor por minuto: %.2f\n"
                + "Valor a cancelar: %.2f\n", ft.obtenerNumeroTelefono(),
                ft.obtenerMinutosMes(), ft.obtenerValorMinuto(),
                ft.obtenerValorFactura());
    }
}
