/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPracticas;

import Practica2.*;

/**
 *
 * @author usuario
 */
public class UsaPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        PilaLenta pila = new PilaLenta(10);
        
        productor p1 = new productor(pila);
        productor p2 = new productor(pila);
        
        consumidor c1 = new consumidor(pila);
        consumidor c2 = new consumidor(pila);
        
        Thread h_c1 = new Thread(c1);
        Thread h_c2 = new Thread(c2);
        
        p1.start();
        p2.start();
        
        p1.join();
        p2.join();
        
        h_c1.start();
        h_c2.start();
        
        
        h_c1.join();
        h_c2.join();
        
        
       
    }
    
}
