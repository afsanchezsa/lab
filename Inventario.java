/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author USUARIO
 */
public class Inventario {
    //TreeMap<String,Producto>productos;
    ArrayList <Producto>productos;
    
    
    public Inventario() {
    //this.productos=new TreeMap<>();    
    this.productos=new ArrayList<>();
    }
    public void addProducto(Producto producto){
   // this.productos.put(producto.getNombre(), producto);
    this.productos.add(producto);
    /*}else{
    return false;
    }*/
    }

    public /*TreeMap<String, Producto>*/ArrayList<Producto> getProductos() {
        return productos;
    }
    
    public int  ContarProducto(String nombreproducto){
    int contador=0;
  // ArrayList <Producto>product=this.productos;
    
    for(Producto p:this.productos){
    if(p.getNombre().equalsIgnoreCase(nombreproducto)){
    contador++;
    }
    }
        return contador;
    }
    public ArrayList<String>productossinrepetir(){
    int i=0;
        ArrayList<String> prod=new ArrayList<>();
    ArrayList<String>comodin=new ArrayList<>();
    int tamano=comodin.size();
    for(Producto p:this.productos){
    comodin.add(p.getNombre());
    }
    while(i<tamano){
    prod.add(comodin.get(i));
    
    
    for(int j=i+1;j<tamano;j++){
    if(comodin.get(j).equalsIgnoreCase(comodin.get(i))){
    comodin.remove(j);
    tamano--;
    
    }
   
    }
    i++;
    
    }
    return prod;
    }
    

}
