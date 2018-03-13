
package serializacion2;

public class Empleado 
{
     String Nombre;
     String ApPaterno;
     String ApMaterno;
     Float SueldoBase;
     String Departamento;

   @Override
    public String toString() {
        return "Empleado{" + "Nombre=" + Nombre + ", ApPaterno=" + ApPaterno + ", ApMaterno=" + ApMaterno + ", SueldoBase=" + SueldoBase + ", Departamento=" + Departamento + '}';
    }

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

    public Float getSueldoBase() {
        return SueldoBase;
    }

    public void setSueldoBase(Float SueldoBase) {
        this.SueldoBase = SueldoBase;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public Empleado(String Nombre, String ApPaterno, String ApMaterno, Float SueldoBase, String Departamento) {
        this.Nombre = Nombre;
        this.ApPaterno = ApPaterno;
        this.ApMaterno = ApMaterno;
        this.SueldoBase = SueldoBase;
        this.Departamento = Departamento;
    }

    public Empleado() {
    }
}
