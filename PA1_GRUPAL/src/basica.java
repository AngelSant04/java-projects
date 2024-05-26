
import java.util.Scanner;

public class basica {
  public static String LeerCadena(String msj){
      String aux;
      System.out.println(msj);
      Scanner teclado=new Scanner(System.in);
      aux=teclado.nextLine();
      return aux;
  }
  public static int LeerEntero(String msj, int vMin, int vMax){
      int aux;
      Scanner teclado=new Scanner(System.in);
      System.out.println(msj);
      do {          
          aux=teclado.nextInt();
      } while (aux<vMin || aux>vMax);
      return aux;
  }
    public static float LeerDecimal(String msj, float vMin, float vMax){
      float aux;
      Scanner teclado=new Scanner(System.in);
      System.out.println(msj);
      do {          
          aux=teclado.nextFloat();
      } while (aux<vMin || aux>vMax);
      return aux;
  }
    public static int Menu(){
    String TMenu[]=
    {"Registrar Docente",
     "Registrar Administrativo",
     "Presentar todos los empleados",
     "Mostrar el(los) empleados con menor sueldo",
     "Mostrar los sueldos de todos los empleados",
     "Mostrar la cantidad de docentes por curso",
     "Mostrar la cantidad de administrativos según su AFP",
     "Mostrar el importe total en los docentes por curso",
     "Ingresar un rango de fechas y mostrar los empleados que ingresaron en dicho rango fecha",
     "Salir"
    };
     for (int i = 0; i < TMenu.length; i++) {
           System.out.println("["+(i+1)+"]--"+TMenu[i]);
       }            
     int opcion=LeerEntero("Ingrese Opcion :", 1, TMenu.length);
     return opcion;
    }
}
