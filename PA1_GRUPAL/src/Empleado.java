
public class Empleado  {
    protected int codigo;
    protected String nombres;
    protected String apellidos;
    protected String DNI;
    protected String direccion;
    protected String fechaNac;
    protected String fechaIng;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(String fechaIng) {
        this.fechaIng = fechaIng;
    }
    
    public void Leer(){
        this.nombres=basica.LeerCadena("Ingrese nombres del empleado:");
        this.apellidos=basica.LeerCadena("Ingrese apellidos del empleado:");
        //this.DNI=basica.LeerCadena("Ingrese DNI del empleado:");
        this.direccion=basica.LeerCadena("Ingrese direccion del empleado:");
        this.fechaNac=basica.LeerCadena("Ingrese fecha nacimiento del empleado:");
        this.fechaIng=basica.LeerCadena("Ingrese fecha ingreso del empleado:");
    }
    public void Mostrar(){
        System.out.println("Los nombres del empleados son:"+nombres); 
        System.out.println("Los apellidos del empleados son:"+apellidos); 
        System.out.println("El DNI del empleados son:"+DNI); 
        System.out.println("La fecha nacimiento del empleados es:"+fechaNac);
        System.out.println("La fecha ingreso del empleados es:"+fechaIng);
    }
}
