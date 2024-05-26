/*
    El volumen de la revista tiene que ver en el precio, habiendo una diferencia de 150 soles
    con respecto al volumen anterior
 */
package clases;

public class clsRevista extends clsPublicacion{
    private int volumen;

    public clsRevista() {
    }

    public clsRevista(int volumen, String titulo, String editorial, int aniopublicacion) {
        super(titulo, editorial, aniopublicacion);
        this.volumen = volumen;
    }    

    public int getVolumen() {
        return volumen;
    }
    
    @Override
    public String mostrar(){
        return super.mostrar()+" - "+this.volumen+" - "+this.precio;
    }

    @Override
    public void calcularPrecio(double precio) {
        this.precio = precio + (this.volumen - 1)*150;  // El precio es el precio establecido en el
                                                        // en volumen I.
    }

}
