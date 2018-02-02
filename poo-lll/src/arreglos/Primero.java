/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author T-102
 */
public class Primero {
    
    public static void main(String[] args) {
        
        //ARREGLOS NO MUTABLES
        
        int [] x={5,-2,6};
        
        //PARA OBTENER UN ELEMENTO DEL ARREGLO USAMOS LOS SIGUIENTE
        
        System.out.println(x[2]);
    
        //TODOS LOS ARREGLOS NO MUTABLES TIENEN UNA PROPIEDAD PARA SABER SU TAMAÑO
        
        System.out.println(x.length);
        
        //VAMOS A ITERAR EL ARREGLO CON UN CICLO FOR
        
        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);
        }
        
        //VAMOS A ITERAR EL ARREGLO CON UN CICLO FOR MEJORADO
        
        for(int a:x)
        {
            System.out.println(a);
        }
        
    }
    
}
