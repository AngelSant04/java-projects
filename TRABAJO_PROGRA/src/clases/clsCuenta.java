
package clases;

import static clases.clsConstantes.CUENTA;


public abstract class clsCuenta {
    private String solicitante;
    private int DNI;
    private int tipo;
    private int clave;
    float interes;
    float tn;
    float tea;
    float prestamo;
    protected float capital;
    public clsCuenta(String solicitante, int DNI, int tipo, int clave,float capital) {
        this.solicitante = solicitante;
        this.DNI = DNI;
        this.tipo = tipo;
        this.clave = clave;
        this.capital=capital;
        this.prestamo=0;
        this.tn=(float) (0.3/12);
        this.tea=(float) (Math.pow((1+tn),12)-1);
    }
    public abstract void deposito(float deposito);
    public abstract void retiro(float retiro);
    public float prestamo(int periodo,float cuota){
        float cuotareal;
        periodo*=12;
        tea=tea/12;
        float numerador=(float) (tea*Math.pow(1+tea,periodo));
        float denominador=(float) (Math.pow(1+tea,periodo)-1);
        cuotareal=3000*(numerador/denominador);
        if(cuotareal>cuota){
            return -1;
        }
        return cuotareal;
    }
    public int getDNI() {
        return DNI;
    }

    public int getTipo() {
        return tipo;
    }
    public int getClave() {
        return clave;
    }
    public float getCapital() {
        return capital;
    }
    public String mostrar(){
         return CUENTA[tipo-1]+"\n"+"Titular: "+solicitante+"\n"+"DNI:"+DNI+"\n"+"Capital:"+capital;
     }

}
