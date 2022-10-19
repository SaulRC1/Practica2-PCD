/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HiladoExplicacion;

/**
 *
 * @author usuario
 */
public class Recurso {
    
    private int contador = 0;
    
    public synchronized void incrementar(){
        this.contador++;
    }
    
    public int dameContador(){
        return this.contador;
    }
    
}
