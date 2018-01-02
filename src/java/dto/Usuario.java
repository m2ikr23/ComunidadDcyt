/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author m2iker
 */
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable{
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;   
    protected String nombre= " ";   
    protected String cedula= " ";   
    protected String telefono= " ";    
    protected String correo = " ";
    protected String password= " ";
    protected String estatus= " ";
   public Usuario(){
   }

    public Usuario(String cedula, String nombre,String telefono, String correo, String password,String status){ 
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo=correo;
        this.password=password;
        this.estatus="A";
    }
    

    
 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

 
    
    
}
