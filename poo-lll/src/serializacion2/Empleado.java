
package serializacion2;

public class Empleado 
{
    private String Nombre;
    private String ApPaterno;
    private String ApMaterno;
    private Integer SueldoBase;
    private String Departamento;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApPaterno() {
        return ApPaterno;
    }

    public void setApPaterno(String ApPaterno) {
        this.ApPaterno = ApPaterno;
    }

    public String getApMaterno() {
        return ApMaterno;
    }

    public void setApMaterno(String ApMaterno) {
        this.ApMaterno = ApMaterno;
    }

    public Integer getSueldoBase() {
        return SueldoBase;
    }

    public void setSueldoBase(Integer SueldoBase) {
        this.SueldoBase = SueldoBase;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public Empleado(String Nombre, String ApPaterno, String ApMaterno, Integer SueldoBase, String Departamento) {
        this.Nombre = Nombre;
        this.ApPaterno = ApPaterno;
        this.ApMaterno = ApMaterno;
        this.SueldoBase = SueldoBase;
        this.Departamento = Departamento;
    }

    public Empleado() {
    }
}
