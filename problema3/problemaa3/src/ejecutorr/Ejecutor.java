/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutorr;
import InstEduc.Problemaa3;
/**
 *
 * @author USUARIO 2020
 */
public class Ejecutor {
    public static void main(String[] args){
        Problemaa3 inst = new Problemaa3();
        Problemaa3 inst2 = new Problemaa3();
        String nombre = "UNIVERSIDAD TECNICA DE AMBATO U.T.A.";
        String tipo_institucion = "Pública";
        int num_alumnos = 1526;
        int num_docent = 500;
        int num_sedes = 2;
        double gastos_estudiantes = 150.65;
        
        inst.establecerNombre(nombre);
        inst.establecerTipo_institucion(tipo_institucion);
        inst.establecerNum_alumnos(num_alumnos);
        inst.establecerNum_docent(num_docent);
        inst.establecerNum_sedes(num_sedes);
        inst.establecerGastos_estudiantes(gastos_estudiantes);
        
        inst.calcularPresupuesto();
        
        System.out.printf("**Institucion Educativa 1**\n\nNombre de la Institución:%s\n"
                + "Tipo de institución: %s\nNúmero de alumnos: %d\n"
                + "Número de docentes: %d\nNúmero de sedes: %d\n"
                + "Gasto por estudiante: %.2f\n"+"Presupuesto: %.2f\n",inst.obtenerNombre(),
                inst.obtenerTipo_institucion(),inst.obtenerNum_alumnos(),
                inst.obtenerNum_docent(),inst.obtenerNum_sedes(),
                inst.obtenerGastos_estudiantes(),inst.obtenerPresupuesto());
        
        //--------------------------------------------------------------------------------------
        nombre = "UNIVERSIDAD SAN FRANCISCO DE QUITO";
        tipo_institucion = "Privada";
        num_alumnos = 2656;
        num_docent = 647;
        num_sedes = 2;
        gastos_estudiantes = 150.65;
        
        inst2.establecerNombre(nombre);
        inst2.establecerTipo_institucion(tipo_institucion);
        inst2.establecerNum_alumnos(num_alumnos);
        inst2.establecerNum_docent(num_docent);
        inst2.establecerNum_sedes(num_sedes);
        inst2.establecerGastos_estudiantes(gastos_estudiantes);
        
        inst2.calcularPresupuesto();
        
        System.out.printf("**Institucion Educativa 2**\n\nNombre de la Institución:%s\n"
                + "Tipo de institución: %s\nNúmero de alumnos: %d\n"
                + "Número de docentes: %d\nNúmero de sedes: %d\n"
                + "Gasto por estudiante: %.2f\n"+"Presupuesto: %.2f\n",inst2.obtenerNombre(),
                inst2.obtenerTipo_institucion(),inst2.obtenerNum_alumnos(),
                inst2.obtenerNum_docent(),inst2.obtenerNum_sedes(),
                inst2.obtenerGastos_estudiantes(),inst2.obtenerPresupuesto());
    }
}
