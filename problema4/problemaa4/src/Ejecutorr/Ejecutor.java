/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutorr;
import problemaa4.Problemaa4;
/**
 *
 * @author USUARIO 2020
 */
public class Ejecutor {
    public static void main(String[] args) {
        Problemaa4 celu = new Problemaa4();
        Problemaa4 celu2 = new Problemaa4();
        String sistema_op = "Android";
        double costo_i = 200.50;
        double tamaño_p = 5.5;
        int iva = 12;
        String direccion_mac = "8k6j4d2b";
        String infor_Imei = "761583490579165";
        
        celu.establecerSistema_op(sistema_op);
        celu.establecerCosto_i(costo_i);
        celu.establecerTamaño_pantalla(tamaño_p);
        celu.establecerIva(iva);
        celu.establecerDireccion_mac(direccion_mac);
        celu.establecerInfor_Imei(infor_Imei);
        
        celu.calcularIva_costoinicial();
        celu.calcularCosto_final();
        
        System.out.printf("**Equipo Celular Nº1** :\n\nSistema Operativo:%s\n"
                + "Su Costo Inicial es: %.2f\n"+"Tamaño de Pantalla: %.2f\nIva de Ecuador:  %d\n"
                + "Direcciòn Mac: %s\nInformacion IMEI: %s\n"+"Iva Costo Inicial: %.2f\n"+"El costo Final es: %.2f",celu.obtenerSistema_op(),
                celu.obtenerCosto_i(),celu.obtenerTamaño_pantalla(),celu.obtenerIva(),
                celu.obtenerDireccion_mac(),celu.obtenerInfor_Imei(),celu.obtenerIva_costoinicial(),celu.obtenerCosto_final());
        
        //----------------------------------------------------------------------
        sistema_op = "Iphone";
        costo_i = 800.26;
        tamaño_p = 6.3;
        iva = 12;
        direccion_mac = "9g1i2s3i";
        infor_Imei = "634080973840512";
        
        celu2.establecerSistema_op(sistema_op);
        celu2.establecerCosto_i(costo_i);
        celu2.establecerTamaño_pantalla(tamaño_p);
        celu2.establecerIva(iva);
        celu2.establecerDireccion_mac(direccion_mac);
        celu2.establecerInfor_Imei(infor_Imei);
        
        celu2.calcularIva_costoinicial();
        celu2.calcularCosto_final();
        
        System.out.printf("\n**Equipo Celular Nº2** :\n\nSistema Operativo:%s\n"
                + "Su Costo Inicial es: %.2f\n"+"Tamaño de Pantalla: %.2f\nIva de Ecuador:  %d\n"
                + "Direcciòn Mac: %s\nInformacion IMEI: %s\n"+"Iva Costo Inicial: %.2f\n"+"El costo Final es: %.2f",celu2.obtenerSistema_op(),
                celu2.obtenerCosto_i(),celu2.obtenerTamaño_pantalla(),celu2.obtenerIva(),
                celu2.obtenerDireccion_mac(),celu2.obtenerInfor_Imei(),celu2.obtenerIva_costoinicial(),celu2.obtenerCosto_final());
    }
}
