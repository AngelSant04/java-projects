/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsConsultorio {
    
    private String especialidad;
    private String nombDoctor;
    private int cantCitas;

    public clsConsultorio() {
    }

    public clsConsultorio(String especialidad, String nombDoctor, int cantCitas) {
        this.especialidad = especialidad;
        this.nombDoctor = nombDoctor;
        this.cantCitas = cantCitas;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getNombDoctor() {
        return nombDoctor;
    }

    public int getCantCitas() {
        return cantCitas;
    }

    public void setCantCitas(int cantCitas) {
        this.cantCitas = cantCitas;
    }   
    
    @Override
    public String toString() {
        return especialidad+" - "+nombDoctor;
    }
    
    
    
}
