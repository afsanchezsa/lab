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
public class Proveedor {
private int nit;
private String RazonSocial;

    public Proveedor(int nit, String RazonSocial) {
        this.nit = nit;
        this.RazonSocial = RazonSocial;
    }

    public int getNit() {
        return nit;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }
    

}
