/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsContenido {
    private String titulo;
    private int tipodecontenido;
    private int categoria;
    private int horadeincio;
    private int horafinal;  

    public clsContenido() {
    }

    public clsContenido(String titulo, int tipodecontenido, int categoria, int horadeincio, int horafinal) {
        this.titulo = titulo;
        this.tipodecontenido = tipodecontenido;
        this.categoria = categoria;
        this.horadeincio = horadeincio;
        this.horafinal = horafinal;
    }     
    
    public String getTitulo() {
        return titulo;
    }

    public int getTipodecontenido() {
        return tipodecontenido;
    }

    public int getCategoria() {
        return categoria;
    }

    public int getHoradeincio() {
        return horadeincio;
    }

    public int getHorafinal() {
        return horafinal;
    }  

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String mostrar(){
        return titulo+"-"+clsConstantes.CATEGORIA[(this.categoria-1)];            
    }
        
}
