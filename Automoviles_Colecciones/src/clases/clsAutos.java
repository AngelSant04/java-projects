package clases;

public class clsAutos {
    private String placa, modelo, marca;

    public clsAutos() {
    }

    public clsAutos(String placa, String modelo, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }
    
    @Override
    public String toString() {
        return placa +" - "+modelo+" - "+marca; 
    }
    
}
