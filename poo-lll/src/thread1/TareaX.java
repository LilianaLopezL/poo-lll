/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

/**
 *
 * @author T-102
 * PRIMETA FORMA DE CREAR UN THREAD
 * 1. HEREDANDO LA CLASE
 */
public class TareaX extends Thread
{

    @Override
    public void run() 
    {
        System.out.println("Soy un Thread muy sencillito y me llamo " + Thread.currentThread().getName());
    }
    
}
