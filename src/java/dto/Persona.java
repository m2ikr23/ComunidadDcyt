/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance

public abstract class Persona implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;   
    protected String nombre= " ";   
    protected String cedula= " ";   
    protected String telefono= " ";    
    protected String correo = " ";
    protected String password= " ";
    protected String estatus= " ";

    public Persona() {
        super();
    }

    public Persona(String nombre, String cedula, String telefono, String correo, String password,String estatus) {
        super();
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo=correo;
        this.password=password;
        this.estatus=estatus;

    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }



    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}
