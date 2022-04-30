/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutoor;

import problemaa2.EquivalenteHora;
/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        EquivalenteHora hr = new EquivalenteHora();
        EquivalenteHora hr2 = new EquivalenteHora();
        int horas = 72;
                
        hr.establecerhoras(horas);
        hr.calcularrminutos();
        hr.calcularsegundos();
        hr.calculardias();
        
        System.out.printf("**El equivalente N°1**\nCantidad de horas:%d\n"
                + "Equivalente Minutos: %d\nEquivalente Segundos: %d\n"
                + "Equivalente Días: %.2f\n",hr.obtenerhoras(),hr.obtenerminutos(),
                hr.obtenerersegundos(),hr.obtenererdias());
        
        
        horas = 10;
          
        hr2.establecerhoras(horas);
        hr2.calcularrminutos();
        hr2.calcularsegundos();
        hr2.calculardias();
        
        System.out.printf("\n**El equivalente N°2**\nCantidad de horas:%d\n"
                + "Equivalente Minutos: %d\nEquivalente Segundos: %d\n"
                + "Equivalente Días: %.2f\n",hr2.obtenerhoras(),hr2.obtenerminutos(),
                hr2.obtenerersegundos(),hr2.obtenererdias());
    }
}
