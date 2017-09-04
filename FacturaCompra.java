/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

/**
 *
 * @author USUARIO
 */
public class FacturaCompra {
private int numero;
private Date Fecha;
private int IdProveedor;
private String NombreProveedor;
private int FormaPago;
private ArrayList<Detalle>detalles;
private Proveedor proveedor;
private Date FechaVencimiento;
private TreeMap<Integer,Pedido>pedidos;
private int numfact=0;
    public FacturaCompra(int ano, int mes, int dia, int FormaPago,Proveedor proveedor,int anovencimiento,int mesvencimiento,int diavencimiento) {
        this.numero=numfact;
        this.Fecha = new Date(ano, mes, dia);
        this.FormaPago = FormaPago;
        this.detalles=new ArrayList<>();
        this.proveedor=proveedor;
        this.FechaVencimiento=new Date(anovencimiento, mesvencimiento, diavencimiento);
        numfact++;
        this.pedidos=new TreeMap<>();
                
    }
   
public Date getFecha() {
        return Fecha;
    }

    public int getIdProveedor() {
        return IdProveedor;
    }

    public String getNombreProveedor() {
        return NombreProveedor;
    }

    public int getFormaPago() {
        return FormaPago;
    }
    public boolean llenarDetalle(){
    boolean llenado=true;
        for(int i=0;i<this.pedidos.size();i++){
        Detalle midetalle=new Detalle(pedidos.get(i).getCantidadproducto(),pedidos.get(i).getProducto());
            if(this.detalles.add(midetalle)){
            llenado=llenado&&true;
            }else{
            llenado=false;
            }
        
          
        }
        return llenado;
    }
    public void addPedido(TreeMap<Integer,Pedido> pedido){
    this.pedidos=pedido;
        
        
    
    }

    public ArrayList<Detalle> getDetalles() {
        return detalles;
    }

    
}
