/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa4;

/**
 *
 * @author USUARIO 2020
 */
public class Problemaa4 {

    private String sistema_op;
    private double tamaño_pantalla;
    private double costo_i;
    private int iva;
    private double iva_costoinicial;
    private String direccion_mac;
    private String infor_Imei;
    private double costo_final;
    
    public void establecerSistema_op(String c){
        sistema_op = c;
    }
    
    public void establecerTamaño_pantalla(double c){
        tamaño_pantalla = c;
    }
    
    public void establecerCosto_i(double c){
        costo_i = c;
    }
    
    public void establecerIva(int c){
        iva = c;
    }
    
    public void calcularIva_costoinicial(){
        iva_costoinicial = (costo_i*12)/100;
    }
    
    public void establecerDireccion_mac(String c){
        direccion_mac = c;
    }
    
    public void establecerInfor_Imei(String c){
        infor_Imei = c;
    }
    
    public void calcularCosto_final(){
        costo_final = costo_i + iva_costoinicial ;
    }
    //-----------------------------------------------------------------
    public String obtenerSistema_op(){
        return sistema_op;
    }
    
    public double obtenerTamaño_pantalla(){
        return tamaño_pantalla;
    }
    
    public double obtenerCosto_i(){
        return costo_i;
    }
    
    public int obtenerIva(){
        return iva;
    }
    
    public double obtenerIva_costoinicial(){
        return iva_costoinicial;
    }
    
    public String obtenerDireccion_mac(){
        return direccion_mac;
    }
    
    public String obtenerInfor_Imei(){
        return infor_Imei;
    }
    
    public double obtenerCosto_final(){
        return costo_final;
    }
}
