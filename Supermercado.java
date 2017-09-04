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
public class Supermercado {
private String nombre;
private int nit;
private Nomina nomina;
private Inventario inventario;
private TreeMap<Integer,Factura>facturas;
private TreeMap<Integer,Pedido>pedidos;
private ArrayList<FacturaCompra>facturascompra;
private ArrayList<Proveedor>proveedores;


    public Supermercado(String nombre, int nit) {
        this.facturas=new TreeMap<>();
        this.pedidos=new TreeMap<>();
        this.facturascompra=new ArrayList<>();
        this.inventario=new Inventario();        
        this.nombre = nombre;
        this.nit = nit;
        this.nomina=new Nomina();
        this.proveedores=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getNit() {
        return nit;
    }
   
    public boolean addFacturaCompra( int ano,int mes, int dia,int formapago,Proveedor proveedor,int anovencimiento,int mesvencimiento,int diavencimiento){
        if(this.facturascompra.add(new FacturaCompra(ano,mes,dia,formapago,proveedor,anovencimiento,mesvencimiento,diavencimiento))){
        return true;
        }
    return false;
    
    }
    public Nomina getNomina(){
    return nomina;
    }
    public boolean addFactura(Date fecha,int IdCliente,String NombreCliente,int FormaPago,int anovencimiento,int mesvencimiento,int diavencimiento){
        Factura mifactura=new Factura(fecha,IdCliente,NombreCliente,FormaPago,anovencimiento,mesvencimiento,diavencimiento);
    if(this.facturas.put(mifactura.getNumero(),mifactura)!=null){
    return true;
    }
    return false;
    }
    public Inventario getInventario(){
    return this.inventario;
    }
    public boolean addPedido(Producto producto,int cantidadproducto){
    Pedido pedido=new Pedido(producto, cantidadproducto);
        if(this.pedidos.put(pedido.getNumero(),pedido)!=null){
        return true;
        }
    return false;
    }

    public TreeMap<Integer, Pedido> getPedidos() {
        return pedidos;
    }

    public TreeMap<Integer, Factura> getFacturas() {
        return facturas;
    }

    public ArrayList<FacturaCompra> getFacturascompra() {
        return facturascompra;
    }
    public void borrarPedidos(){
    this.pedidos=null;
    
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }
    public ArrayList<String> agotados(){
    ArrayList<String>productosagotados=new ArrayList<>();
    for(int i=0;i<this.inventario.getProductos().size();i++){
    if(this.inventario.ContarProducto(this.inventario.getProductos().get(i).getNombre())<3){
    productosagotados.add(this.inventario.getProductos().get(i).getNombre());
    }
    
    }
    return productosagotados;
    
    }
    public TreeMap<String,Integer> lomascomprado(){
    int comodin;
        
    TreeMap<String,Integer>consolidado=new TreeMap<>();
    for(Producto p:this.getInventario().getProductos()){
    consolidado.put(p.getNombre(),0);
    
    }
    for(int i=0;i<this.facturas.size();i++){
    for(Detalle d:this.facturas.get(i).getDetalles()){
    comodin=consolidado.get(d.getProducto().getNombre());
    consolidado.replace(d.getProducto().getNombre(), comodin, comodin+d.getCantidadProducto());
    }
    }
    
    return consolidado;
    }
}
