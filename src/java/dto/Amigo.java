/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;
import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author m2iker
 */
@Entity
public class Amigo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String correo;
    

    public Amigo() {
    }
    
    public Amigo(String nombre, String correo){

        this.nombre=nombre;
        this.correo=correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
