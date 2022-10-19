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
public class HiloThread extends Thread {

    private int id;
    private Recurso r;

    public HiloThread(int id, Recurso r) {
        this.id = id;
        this.r = r;
    }

    @Override
    public void run() {

        /*for (int i = 0; i < 10/id; i++) {
            if (id == 1) {
                this.setPriority(i + 1);
            }
            System.out.println("Soy el hilo tipo thread " + id
                    + " con nombre: " + getName() + " con id: " + getId()
                    + " con estado: " + getState() + " con prioridad: " + getPriority());
            try {
                sleep(25);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
        
        for (int i = 0; i < 1000; i++) {
            
            r.incrementar();
            
        }
        
        System.out.println("Contador: " + r.dameContador());
    }

}
