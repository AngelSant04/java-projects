
package trabajo_progra;

import static clases.clsConstantes.CUENTA;
import static clases.clsConstantes.OPCIONES;
import static clases.clsConstantes.VALIDAR;
import clases.clsCtaAhorro;
import clases.clsCtaCorriente;
import clases.clsCtaSueldo;
import clases.clsCuenta;
import clases.clsListaCuentas;
import java.util.Scanner;


public class TRABAJO_PROGRA {
        static int leerEntero(String msje, int min, int max,String error){
	Scanner lector=new Scanner(System.in);
        int num;
        do{
	      System.out.print(msje);
              num=lector.nextInt();
        if(num<min||num>max){
      	      System.out.println(error);
         }
         }while(num<min || num>max);
         return num;
}

        static int opciones(String opciones[],int cantidad,String error) {
        int op;
        for(int i=0;i<cantidad;++i){
   	    System.out.println((i+1)+"."+opciones[i]);
   }
        op = leerEntero("Seleccione Opcion:", 1, cantidad, error);
        return op;
       }
        static void llenarObjeto(clsListaCuentas Lista){
        String solicitante;
        int clave;
        int DNI;
        int validar;
        int tipo;
        float capital;  
        clsCuenta obj;
        Scanner lector=new Scanner(System.in);
        System.out.print("Nombre Titular:");
        solicitante=lector.next();
        System.out.print("Ingrese DNI:");
        DNI=lector.nextInt();
        System.out.print("Ingrese Monto a Aperturar:");
        capital=lector.nextFloat();
        tipo=opciones(CUENTA, 3, "Opcion Incorrecta");
        clave=leerEntero("Ingrese Clave(4 digitos):",1000,9999,"Clave Incorrecta");
        if(tipo==1){
            float seguro; 
            System.out.println("Desea seguro de cuenta(3% por operacion):");
            validar=opciones(VALIDAR, 2, "Vuelva a intentar");
            if(validar==1){
                seguro=(float) 0.03;
            }
            else{
                seguro=0;
            }
            
            obj= new clsCtaAhorro(solicitante, DNI, tipo, clave,seguro,capital);
            Lista.insertar(obj);
  
        }
        if(tipo==2){
            String RUP;
            System.out.print("Ingrese RUP(Natural o Juridico):");
            RUP=lector.next();
            obj=new clsCtaCorriente(solicitante, DNI, tipo, clave,RUP,capital);
             Lista.insertar(obj);
  
        }
        if(tipo==3){
            String empleador;
            String RUPemp;
            float sueldo;
            System.out.print("Ingrese Empleador:");
            empleador=lector.next();
            System.out.print("Ingrese RUPemp:");
            RUPemp=lector.next();
            System.out.println("Ingrese Sueldo:");
            sueldo=lector.nextFloat();
            obj=new clsCtaSueldo(solicitante, DNI, tipo, clave, empleador, sueldo,RUPemp,capital);
            Lista.insertar(obj);
        }
    }
        static void depositos(clsListaCuentas Lista){
            Scanner lector=new Scanner(System.in);
            int DNIaux;
            int pos;
            System.out.println("Ingrese DNI Titular:");
            DNIaux=lector.nextInt();
            pos=Lista.buscar(DNIaux);
            if(pos>=0){
                int clave;
                int valid;
                float deposito;
                System.out.print("Ingrese cantidad a depositar:");
                deposito=lector.nextFloat();
                System.out.print("Ingrese Clave Secreta:");
                clave=lector.nextInt();
                valid=Lista.depositar(deposito, pos, clave);
                if(valid>=1){
                    System.out.println("DEPOSITO REALIZADO CON EXITO");
                }
                else{
                    System.out.println("CLAVE INVALIDA");
                }
     
            }
            else{
                System.out.println("TITULAR NO ENCONTRADO");
            }
  
        }
        static void retiro(clsListaCuentas Lista){
            Scanner lector=new Scanner(System.in);
            clsCuenta obj;
            int DNIaux;
            int pos;
            System.out.println("Ingrese DNI Titular:");
            DNIaux=lector.nextInt();
            pos=Lista.buscar(DNIaux);
            if(pos>=0){
                int clave;
                int valid;
                float retiro;
                System.out.print("Ingrese cantidad a retirar:");
                retiro=lector.nextFloat();
                obj=Lista.getCuenta(pos);
                System.out.print("Ingrese Clave Secreta:");
                clave=lector.nextInt();
                if(obj.getCapital()!=0 && retiro<obj.getCapital() ){
                    valid=Lista.retirar(retiro, pos, clave);
                    if(valid>=1){
                        System.out.println("RETIRO REALIZADO CON EXITO");
                    }
                    else{
                        System.out.println("CLAVE INVALIDA");
                    }
                }
                else{
                    System.out.println("CANTIDAD INVALIDA");   
                }
            }
            else{
                System.out.println("TITULAR NO ENCONTRADO");
            }
        }
       static void prestamos(clsListaCuentas Lista){
           Scanner lector=new Scanner(System.in);
           int DNIaux;
           int pos;
           int valid=0;
           clsCuenta obj;
           System.out.println("Ingrese DNI Titular:");
           DNIaux=lector.nextInt();
           pos=Lista.buscar(DNIaux);
           if(pos>=0){
                 obj=Lista.getCuenta(pos);
                 if(obj.getCapital()>=5000){
                     System.out.println("\tFELCITACIONES TU DINERO ESPERA POR TI");
                     System.out.println("Tienes un credito aprobado de 3000(Tasa Nominal 30%)");
                     System.out.println("¿DESEAS EVALUAR TUS TERMINOS DE PAGO?");
                     valid=opciones(VALIDAR, 2, "Intente de Nuevo");
                     if(valid==1){
                         int periodo;
                         float cuota;
                         float cuotareal;
                         System.out.print("Ingresa el tiempo de amortización(años):");
                         periodo=lector.nextInt();
                         System.out.print("Ingresa la cuota mensual que puedes cancelar:");
                         cuota=lector.nextFloat();
                         cuotareal=Lista.prestamo(periodo,cuota,pos);
                         if(cuotareal>=0){
                             System.out.println("Tu mensualidad a pagar durante "+periodo+" años es: "+cuotareal);
                         }
                         else{
                         System.out.println("Lo sentimos no logra acceder a un credito bancario");
                         }
                     }
                     else{
                         System.out.println("SU CREDITO ESPERA POR USTED ...");
                     }
                     
                 }
           }
           else{
               System.out.println("Cliente No Encontrado");
           }

        }
    public static void main(String[] args) {
         clsListaCuentas lista=new clsListaCuentas();
     int op;
        do {
            System.out.println("\t"+"---APP DE BANCO---");
            op=opciones(OPCIONES,6,"OPCION NO VALIDA");
            switch (op) {
                case 1:
                    System.out.println("***REGISTRO DE CUENTAS***");
                    llenarObjeto(lista);
                    break;
                case 2:
                    System.out.println("***LISTADO DE CUENTAS***");
                    System.out.println(lista.presentar());//ENCAPSULAMIENTO TOTAL
                    break;
                case 3:
                    System.out.println("***DEPOSITO***");
                    depositos(lista);
                    break;
                case 4:
                    System.out.println("***RETIROS***");
                    retiro(lista);
                    break;
                case 5: 
                    System.out.println("SIMULADOR DE PRESTAMOS:");
                    prestamos(lista);
                    break;
                case 6:
                   System.out.println("SALIENDO ...");
                   break;
                }
        }while (op!=6); 

}
}


