
package serializacion;

import java.io.*;

public class Serializar 
{
    public static void main(String[] args) 
    {
        //1. GENERAR UN SUARIO 
        
        Usuario u=new Usuario(20,"Liliana");
        
        //2. GENERAR UN MODELO DE SERIALIZACIÓN DE LA CLASE QUE SERIALIZABA
        
        PersistenciaUsuarios p=new PersistenciaUsuarios();
        
        //3. AJUSTAR SU ATRIBUTO USUARIO
        
        p.setU(u);
        
        //4. COMPRIMIR
        
        p.guardar();
        
    }
}
