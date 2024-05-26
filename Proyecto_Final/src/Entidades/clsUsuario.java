/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class clsUsuario {
    private String idUsuario;
    private String Nombres;
    private String ApPaterno;
    private String ApMaterno;
    private String cargo;
    private String pasword;

    public clsUsuario() {
    }

    public clsUsuario(String idUsuario, String Nombres, String ApPaterno, String ApMaterno, String cargo, String pasword) {
        this.idUsuario = idUsuario;
        this.Nombres = Nombres;
        this.ApPaterno = ApPaterno;
        this.ApMaterno = ApMaterno;
        this.cargo = cargo;
        this.pasword = pasword;
    }    

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApPaterno() {
        return ApPaterno;
    }

    public String getApMaterno() {
        return ApMaterno;
    }

    public String getCargo() {
        return cargo;
    }

    public String getPasword() {
        return pasword;
    }
}
