
package serializacion;

import java.io.*;

public class Usuario implements Serializable 
{
    int edad;
    String nombre;

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public Usuario() 
    {
    }

    public Usuario(int edad, String nombre) 
    {
        this.edad = edad;
        this.nombre = nombre;
    }
     
}
