/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.lll;

/**
 *
 * @author T-102
 */
public class Usuario {
    
    //Regla 1 de Encapsulamiento
    
   /* private*/     private float peso;
   /* private*/     private float altura;
   
   
    
    //Regla 2 de Encapsulamiento
    
    /*
    public void setPeso(float peso){
        this.peso=peso;
    }
    
    public void setAltura(float altura){
        this.altura=altura;
    }
    
     //Regla 3 de Encapsulamiento
    
    public float getPeso(){
        return peso;
    }
    
    public float getAltura(){
        return altura;
    }
*/

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso Este es el valor del peso que debes pasar al Método.
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

   
    
}
