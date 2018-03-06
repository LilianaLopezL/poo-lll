
package serializacion;

import java.io.*;

public class PersistenciaUsuarios 
{
    
Usuario u;

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }

//GENERAR EL MÉTODO PARA SERIALIZAR AL USUARIO
    
public void guardar()
{
    //SERIALIZAR
    //PASO 1. GENERAR EL ARCHIVO FISICO DONDE ESTARA EL OBJETO DE TIPO USUARIO
    
    File file=new File("Archivaldo.liliana");
 
    //ABRIR PARA ESCRIBIR SOBRE EL
    
    try
    {    
    FileOutputStream fos=new FileOutputStream(file);
    
    //SERIALIZAMOS
    
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    
    //GUARDAMOS NUESTRO USUARIO
    
    oos.writeObject(u);
    
    //MANDAMOS UN MENSAJITO
    
        System.out.println("Objeto Guardado con Éxito !!!");
        
    }
    catch(Exception e)
    {   
        System.out.println(e.getMessage());  
    }
}


public Usuario recobrarUsuario()
{
    File file=new File("Archivaldo.liliana");
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
}
