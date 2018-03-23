/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-102
 */

// SEGUNDA FORMA DE CREAR THREAD: UMPLEMENTANDO LA INTERFAZ RUNNABLE
public class ProbarThreads  implements Runnable
{
    public static void main(String[] args) 
    {
        // 1. CREAR EL THREAD       
        TareaX t1 = new TareaX();
        TareaX t2 = new TareaX();
        
        //////////////////////////////////
        
        Runnable r = new ProbarThreads();
        Thread t3 = new Thread(r);
        
        
        // 2. INICIALIZAR
        t1.setName("Floky");
        
        t1.start();
        t2.start();
        t3.start();
        
        
        // 3. EJECUCIÓN DONDE LA JVM DECIDE      
        // 4. PAUSA, NO LA PONDREMOS AQUÍ
        // ES EN CASO DE QUE DURE CIERTO TIEMPO       
        // 5. MUERTE, FIN DE PROCESO   
    }
    
    @Override
    public void run() 
    {
        // HACEMOS OTRA COSA
        while(true)
        {
            LocalTime tiempo= LocalTime.now();
            int hora = tiempo.getHour();
            int min= tiempo.getMinute();
            int seg= tiempo.getSecond();
            System.out.println("La hora es " + hora + " : " + min + " : " + seg);
            
            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(ProbarThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }     
}

