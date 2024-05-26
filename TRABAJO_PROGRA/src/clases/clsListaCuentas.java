/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author USER
 */
public class clsListaCuentas {
    final int MAX = 10;
    private int total;
    clsCuenta datos[];

    public clsListaCuentas() {
        this.total=0;
        this.datos= new clsCuenta[MAX];
    }
        public void insertar(clsCuenta obj){
        datos[total]=obj;
        total++;
    }
      public String presentar(){
        String contenido="";
        for (int i = 0; i < total; i++) {
            contenido=contenido+datos[i].mostrar()+"\n";
        }
        return contenido;
    }
      public int buscar(int DNI){
        for (int i = 0; i < total; i++) {
            if(datos[i].getDNI()==DNI){
                return i;
            }  
        }
        return -1;
    }
      public float prestamo(int periodo,float cuota,int pos){
          float cuotareal;
          cuotareal=datos[pos].prestamo(periodo, cuota);
          return cuotareal;     
      }
    public int depositar(float deposito,int pos,int clave){
        if(datos[pos].getClave()==clave){
        datos[pos].deposito(deposito);
        return 1;
    }
        return -1;
    }
      public int retirar(float retiro,int pos,int clave){
            if(datos[pos].getClave()==clave){
            datos[pos].retiro(retiro);
            return 1;
    }  
        return -1;
    }
     public clsCuenta getCuenta(int pos){
         return datos[pos];
     }

}
