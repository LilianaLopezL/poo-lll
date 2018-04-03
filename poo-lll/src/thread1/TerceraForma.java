
package thread1;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TerceraForma 
{
    public static void main(String[] args) 
    {
        Thread t1=new Thread(new Runnable() { //CONTIENE UNA IMPLEMENTACION DEL MÉTDO run() DEL Thread, PERO ES ABSTRACTA.
         //ESTO ES LA CLASE INTERNA ANÓNIMA
            public void run()
            {
                while(true)
                {
                LocalTime tiempo= LocalTime.now();
                int hora = tiempo.getHour();
                int min= tiempo.getMinute();
                int seg= tiempo.getSecond();
                //System.out.println("La hora es " + hora + " : " + min + " : " + seg);
            
                try 
                {
                Thread.sleep(1000);
                } 
                    catch (InterruptedException ex) 
                {
                Logger.getLogger(ProbarThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                
            } //SE CIERRA EL MÉTODO MAIN
        } //SE CIERRA LA CLASE INTERNA ANÓNIMA
        ); //SE CIERRA EL CONSTRUCTOR
        
        t1.start();
    }
}
