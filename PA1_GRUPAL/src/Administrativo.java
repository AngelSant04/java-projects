
public class Administrativo extends Empleado {
    private double sueldoB;
    private double sueldo;
    private int AFP;
    
    public Administrativo(){
       super();
       AFP=0;
    }
    
    public double getSueldoB() {
        return sueldoB;
    }

    public void setSueldoB(double sueldoB) {
        this.sueldoB = sueldoB;
    }
    
    public void Leer(){
       super.Leer();
       String Tafp []={"Integra ","Prima","Pro Futuro","Horizonte"};  
       for (int i = 0; i < Tafp.length; i++) {
           System.out.println("["+(i+1)+"]--"+Tafp[i]);
       }
       AFP=basica.LeerEntero("Ingrese el monto del Afp:",1,4);
        //el sueldo del administrativo se calcula por la diferencia del sueldo bruto menos el administrativo
        switch (AFP) {
            case 1:
                sueldo=sueldoB-sueldoB*12.3/100;
                break;
            case 2:
                sueldo=sueldoB-sueldoB*12.6/100;
                break;
            case 3:
                sueldo=sueldoB-sueldoB*11.9/100;
                break;
            case 4:
                sueldo=sueldoB-sueldoB*12.4/100;
                break;
            default:
                break;
        }
    }
    public void Mostrar(){
        super.Mostrar();
        System.out.println("El sueldo del Administrativo es:"+sueldo);
    }
}
