/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones1;

/**
 *
 * @author T-102
 */
public class Primera 
{
    
    public static void main(String[] args) 
    {
        
        // CREACION DE UN ARREGLO
        
        int[] valores ={2,6,-8,5};
        
        for(int i=0;i<=valores.length;i++)
        {
          // System.out.println("Valor "+valores[i]);  ArrayIndexOutOfBoundsException
        }
        
        // EXCEPCION TRUCLENTA
        
        int x=5;        //Operacion aritmetica
        int y=0;
        
        //System.out.println(x/y);  //ArithmeticException
        
        
        
        float x1=5;  //Operacion racional, tiende a infinito
        int y1=0;
        
        System.out.println(x1/y1);  //Infinity
        
        int z=Integer.parseInt("x");
        System.out.println(z*2); // NumberFormatException ... cuando se introduce algo que no corresponde al tipo de dato
        
        

    }
}
