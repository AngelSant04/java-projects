
public class Docente extends Empleado {
    private double horasT;
    private int curso;
    private double sueldo;
    private int tarifa;
    
    public Docente(){
       super();
       curso=0; 
    }

    public double getHorasT() {
        return horasT;
    }

    public void setHorasT(double horasT) {
        this.horasT = horasT;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    
    public void Leer(){
       super.Leer();
       String Tcurso[]={"VB.Net 2010","Oracle","Windows 2008 server","SQL Server 2008"};  
       for (int i = 0; i < Tcurso.length; i++) {
           System.out.println("["+(i+1)+"]--"+Tcurso[i]);
       }
       curso=basica.LeerEntero("Ingrese el curso del docente:",1, 4);
        switch (curso) {
            case 1:
                sueldo=horasT*45;
                break;
            case 2:
                sueldo=horasT*65;
                break;
            case 3:
                sueldo=horasT*70;
                break;
            case 4:
                sueldo=horasT*40;
                break;
            default:
                System.out.println("Curso no existe");
                break;
        }
    }
    public void Mostrar(){
        super.Mostrar();
        System.out.println("El sueldo del empleado es:"+sueldo);
    }
}