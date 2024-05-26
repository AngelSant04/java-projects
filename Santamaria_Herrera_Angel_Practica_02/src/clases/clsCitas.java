/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class clsCitas {
    
    private String Dni;
    private String especialidad;
    private String nombDoctor;
    private String diagnostico;

    public clsCitas() {
    }

    public clsCitas(String dni,String especialidad, String nombDoctor, String diagnostico) {
        this.Dni = dni;
        this.especialidad = especialidad;
        this.nombDoctor = nombDoctor;
        this.diagnostico = diagnostico;
    }

    public String getDni() {
        return Dni;
    }   
    
    public String getEspecialidad() {
        return especialidad;
    }

    public String getNombDoctor() {
        return nombDoctor;
    }

    public String getDiagnostico() {
        return diagnostico;
    }
    
    
    
    @Override
    public String toString() {
        return especialidad+" - "+nombDoctor+" - "+diagnostico;
    }
    
}
