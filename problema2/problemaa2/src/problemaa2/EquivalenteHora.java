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
    private int dias;
 
    public void establecerhoras(int c){
        horas = c;
    }
    
    public void establecerminutos(int c){
        minutos = c;
    }
    
    public void establecersegundos(int c){
        segundos = c;
    }
    
    public void establecerdias(int c){
        dias = c;
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
    
    public int obtenererdias(){
        return dias;
    }
}
