/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.util.HashMap;

/**
 *
 * @author USUARIO
 */
public class Nomina {
    private double LiquidacionTotal;
    HashMap<Integer ,Empleado>empleados;
    public Nomina(){
    LiquidacionTotal=0;
    this.empleados=new HashMap<>();
    
    }
    public double  LiquidacionEmpleado(int IdEmpleado){
    double liquidacion=0;
    for(int i=0;i<empleados.size();i++){
    if(empleados.get(i).getIdEmpleado()==IdEmpleado){
    liquidacion=empleados.get(i).getSalario()*2;
    
    break;
    }
    }
    return liquidacion;
    }
    public double getLiquidacionTotal(){
    for(int i=0;i<empleados.size();i++){
    this.LiquidacionTotal+=empleados.get(i).getSalario()*2;
    }
           
    return this.LiquidacionTotal;
    }
    public boolean addEmpleado(Empleado empleado){
    if(empleados.put(empleado.getIdEmpleado(), empleado)!=null){
    return true;
    }
    return false;
    }
    
}
