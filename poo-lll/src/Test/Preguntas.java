
package Test;

import Test.Opciones;
import java.util.ArrayList;

public class Preguntas 
{
    String titulo;
    ArrayList<Opciones> opcion;

    public String getTitulo() 
    {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public ArrayList<Opciones> getOpciones() 
    {
        return opcion;
    }

    public void setOpciones(ArrayList<Opciones> opcion) 
    {
        this.opcion = opcion;
    }

    public Preguntas() 
    {
    }
}
