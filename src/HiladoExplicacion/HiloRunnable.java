/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HiladoExplicacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class HiloRunnable implements Runnable {

    private int id;
    private int contador = 0;
    public HiloRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        
        Thread b = Thread.currentThread();

        for (int i = 0; i < 10/id; i++) {
            if (id == 1) {
                b.setPriority(i + 1);
            }
            System.out.println("Soy el hilo tipo thread " + id
                    + " con nombre: " + b.getName() + " con id: " + b.getId()
                    + " con estado: " + b.getState() + " con prioridad: " + b.getPriority());
            /*try {
                b.sleep(25);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            this.contador++;
        }
    }
    
    public void verContador(){
        System.out.println("Valor del contador: " + this.contador);
    }

}
