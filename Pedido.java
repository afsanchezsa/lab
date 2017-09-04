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
public class Pedido {
    private int numero;
    private Producto producto;
    private int cantidadproducto;
   private int numpedido=0;
    public Pedido(Producto producto, int cantidadproducto) {
        this.numero=numpedido;
        this.producto = producto;
        this.cantidadproducto = cantidadproducto;
    numpedido++;
    }

    public int getNumero() {
        return numero;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidadproducto() {
        return cantidadproducto;
    }
    


}
