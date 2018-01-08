/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author maike
 */
@Entity
public class Imagen implements Serializable{
    @Id
    private String nombre;
    private byte[] image;

    public Imagen(String nombre, byte[] image) {
        this.nombre = nombre;
        this.image = image;
    }

    public Imagen() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    
}
