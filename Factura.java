/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Factura {
    private int numero;
    private Date Fecha;
    private int IdCliente;
    private String  NombreCliente;
    private int FormaPago;
    private ArrayList<Detalle>detalles;
    private int numfact=0;
    private Date FechaVencimiento;

    public Factura(Date Fecha, int IdCliente, String NombreCliente, int FormaPago,int anovencimiento,int mesvencimiento,int diavencimiento) {
        this.numero=numfact;
        this.Fecha = Fecha;
        this.IdCliente = IdCliente;
        this.NombreCliente = NombreCliente;
        this.FormaPago = FormaPago;
        this.detalles=new ArrayList<>();
        this.FechaVencimiento=new Date(anovencimiento, mesvencimiento, diavencimiento);
        numfact++;
    }
    public boolean addDetalle(Producto producto,int cantidad){
    boolean agregado=false;
    Detalle midetalle=new Detalle( cantidad,producto);
    if(this.detalles.add(midetalle)){
    agregado=true;
    }
    
    return agregado;
    }

    public Date getFecha() {
        return Fecha;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public int getFormaPago() {
        return FormaPago;
    }

    public ArrayList<Detalle> getDetalles() {
        return this.detalles;
    }

    public int getNumero() {
        return numero;
    }
        
    
}
