/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import serializacion.Usuario;

/**
 *
 * @author T-102
 */
public class PersistenciaEmpleado 
{
    ArrayList<Empleado> empleados;

    public PersistenciaEmpleado()
    {
        empleados =new ArrayList<>();
    }
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
public void guardar(Empleado e)
{
    File file=new File("Empleados.lll");
    
    if(file.exists())
    {
        empleados = buscarTodos();
    }
    
    try
    {    
    FileOutputStream fos=new FileOutputStream(file);
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    empleados.add(e);
    oos.writeObject(empleados);
    System.out.println("Objeto Guardado con Éxito !!!");   
    }
    catch(Exception ex)
    {   
        System.out.println(ex.getMessage());  
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public Usuario recobrarUsuario()
{
    File file=new File("Archivaldo.lll");
    Usuario u_recobrado=null;
    
    //PROCESO INVERSO
    try
    {
    FileInputStream fis=new FileInputStream(file);
    ObjectInputStream ois=new ObjectInputStream(fis);
    u_recobrado=(Usuario) ois.readObject();
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage()); 
    }
    return u_recobrado;
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public ArrayList<Empleado> buscarTodos()
{
    File file=new File("Empleado.lll");

try
{
    FileInputStream fis=new FileInputStream(file);
    ObjectInputStream ois = new ObjectInputStream(fis);
    empleados = (ArrayList<Empleado>)ois.readObject();
}
catch(Exception e)
{
    
}
return empleados;
}


}

//GUARDAR 1 O MAS USURIOS DE LAS INTERFACES Y MOSTRARLOS EN LA TABLA DE EMPLEADOS