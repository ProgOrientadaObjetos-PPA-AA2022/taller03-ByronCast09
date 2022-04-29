/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutorterreno;

import problema1.Terreno;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        Terreno tr = new Terreno();
        Terreno tr2 = new Terreno();
        double ancho = 56.1;
        double largo = 100.56;
        double valorMetroCuadrado=45.15 ;
        
        tr.establecerAncho_terreno(ancho);
        tr.establecerLargo_terreno(largo);
        tr.establecerValormetroCuadrado(valorMetroCuadrado);
        tr.calcularArea_terreno();
        tr.calcularCosto_terreno();
        
        
        System.out.printf("Valores del Terreno 1:\n\nAncho del Terreno:%.2f\n"
                + "Largo del Terreno: %.2f\nValor por metro cuadrado: %.2f\n"
                + "Area del Terreno: %.2f\nValor del Terreno: %.2f\n",
                tr.obtenerAncho_terreno(),
                tr.obtenerLargo_terreno(),tr.obtenerValormetroCuadrado()
                ,tr.obtenerArea_terreno(),tr.obtenerCosto_terreno());
        
        
        ancho = 23.56;
        largo = 50.12;
        valorMetroCuadrado=62.15 ;
        
        tr2.establecerAncho_terreno(ancho);
        tr2.establecerLargo_terreno(largo);
        tr2.establecerValormetroCuadrado(valorMetroCuadrado);
        tr2.calcularArea_terreno();
        tr2.calcularCosto_terreno();
        
        
        System.out.printf("\nValores del Terreno 2:\n\nAncho del Terreno:%.2f\n"
                + "Largo del Terreno: %.2f\nValor por metro cuadrado: %.2f\n"
                + "Area del Terreno: %.2f\nValor del Terreno: %.2f\n",
                tr2.obtenerAncho_terreno(),
                tr2.obtenerLargo_terreno(),tr2.obtenerValormetroCuadrado()
                ,tr2.obtenerArea_terreno(),tr2.obtenerCosto_terreno());
}
}
