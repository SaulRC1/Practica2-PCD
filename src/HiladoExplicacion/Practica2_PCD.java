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
public class Practica2_PCD {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    /*public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        Recurso r = new Recurso();
        r.incrementar();
        System.out.println("R contador vale: " + r.dameContador());
        
        HiloThread h1 = new HiloThread(1, r);
        HiloThread h2 = new HiloThread(2, r);
        
        h1.start();
        h2.start();
        
        
        /*HiloThread h1 = new HiloThread(1);
        HiloRunnable r2 = new HiloRunnable(2);
        HiloRunnable r3 = new HiloRunnable(3);
        
        Thread h2 = new Thread(r2);
        Thread h3 = new Thread(r2);
        
        Thread m = Thread.currentThread();

        m.setPriority(Thread.MAX_PRIORITY);
        //h1.start();
        h2.start();
        h3.start();
        
        

        //h1.join();
        h2.join();
        h3.join();
        r2.verContador();
        r3.verContador();
        /*for (int i = 0; i < 10; i++) {

            System.out.println("Hola soy main con nombre: " + m.getName()
                    + " con prioridad: " + m.getPriority());

            Thread.sleep(100);

        }
    }*/

}
