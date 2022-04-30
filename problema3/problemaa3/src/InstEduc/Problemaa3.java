/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InstEduc;

/**
 *
 * @author USUARIO 2020
 */
public class Problemaa3 {
    private String nombre;
    private String tipo_institucion;
    private int num_alumnos;
    private int num_docent;
    private int num_sedes;
    private double gastos_estudiantes;
    private double presupuesto;
    
    public void establecerNombre(String c){
        nombre = c;
    }
    
    public void establecerTipo_institucion(String c){
        tipo_institucion = c;
    }
    
    public void establecerNum_alumnos(int c){
        num_alumnos = c;
    }
    
    public void establecerNum_docent(int c){
        num_docent = c;
    }
    
    public void establecerNum_sedes(int c){
        num_sedes = c;
    }
    
    public void establecerGastos_estudiantes(double c){
        gastos_estudiantes= c;
    }
    
    public void calcularPresupuesto(){
        presupuesto= num_alumnos * gastos_estudiantes;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipo_institucion(){
        return tipo_institucion;
    }
    
    public int obtenerNum_alumnos(){
        return num_alumnos;
    }
    
    public int obtenerNum_docent(){
        return num_docent;
    }
    
    public int obtenerNum_sedes(){
        return num_sedes;
    }
    
    public double obtenerGastos_estudiantes(){
        return gastos_estudiantes;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}
