/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemaa2;

/**
 *
 * @author SALA I
 */
public class EquivalenteHora{
    private int horas;
    private int minutos;
    private int segundos;
    private double dias;
 
    public void establecerhoras(int c){
        horas = c;
    }
    
    public void calcularrminutos(){
        minutos = horas * 60;
    }
    
    public void calcularsegundos(){
        segundos = horas * 3600;
    }
    
    public void calculardias(){
        dias = horas * 0.0417;
    }
    
    public int obtenerhoras(){
        return horas;
    }
    public int obtenerminutos(){
        return minutos;
    }
    
    public int obtenerersegundos(){
        return segundos;
    }
    
    public double obtenererdias(){
        return dias;
    }
}
