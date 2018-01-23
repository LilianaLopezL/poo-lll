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
public class PooLll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        
        //Tenemos que generar los objetos de las clases anteriores
        
        Usuario x=new Usuario();
        x.setAltura(1.50f);
        x.setPeso(46);
        Imc algo=new Imc();
        algo.u=x;
        //Calculamos el imc a traves de su objeto.
        
        System.out.println(algo.calcular());
        

    }
    
}
