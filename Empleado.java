/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

/**
 *
 * @author USUARIO
 */
public class Empleado {
    private int IdEmpleado;
    private String NombreEmpleado;
    private double Salario;
     
   

    public Empleado(int IdEmpleado, String NombreEmpleado, double Salario) {
        this.IdEmpleado = IdEmpleado;
        this.NombreEmpleado = NombreEmpleado;
        this.Salario = Salario;
        
    }
          

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public double getSalario() {
        return Salario;
    }
    
    public double CalcularSueldo(int Horas){
    double sueldo=(this.Salario/240)*Horas;
    return sueldo;
    }
}
