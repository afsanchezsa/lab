/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Producto {
    private int Codigo;
    private double PrecioVenta;
    private double Costo;
    private Date FechaVencimiento;
    private int indice=0;
    private String nombre;

    public Producto( String nombre,double PrecioVenta, double Costo, Date FechaVencimiento) {
        this.Codigo = indice;
        this.PrecioVenta = PrecioVenta;
        this.Costo = Costo;
        this.FechaVencimiento = FechaVencimiento;
        this.nombre=nombre;
         indice++  ; 
    }
        public boolean setPrecioVenta(double precio){
        this.PrecioVenta=precio;
        return true;
              
        }

    public int getCodigo() {
        return Codigo;
    }

    public double getPrecioVenta() {
        return PrecioVenta;
    }

    public double getCosto() {
        return Costo;
    }

    public Date getFechaVencimiento() {
        return FechaVencimiento;
    }

    public String getNombre() {
        return nombre;
    }
        
    
}
