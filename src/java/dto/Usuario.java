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
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue(value = "user")
public class Usuario extends Persona implements Serializable {

    @ManyToMany(cascade = {javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinTable(name = "usuarioAmigo", joinColumns = {
        @JoinColumn(name = "idUsuario")}, inverseJoinColumns = {
        @JoinColumn(name = "idAmigo")})
    private Set<Amigo> amigo = new HashSet();

    @ManyToMany(cascade = {javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinTable(name = "usuarioMensaje", joinColumns = {
        @JoinColumn(name = "idUsuario")}, inverseJoinColumns = {
        @JoinColumn(name = "idMensaje")})
    private Set<Mensaje> mensaje = new HashSet();

    public Usuario() {
    }

    public Usuario(String cedula, String nombre, String telefono, String correo, String password, String status) {

        super(cedula, nombre, telefono, correo, password, status);
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.password = password;
        this.estatus = "A";
    }

    public Set<Amigo> getAmigo() {
        return amigo;
    }

    public void setAmigo(Set<Amigo> amigo) {
        this.amigo = amigo;
    }

    public Set<Mensaje> getMensaje() {
        return mensaje;
    }

    public void setMensaje(Set<Mensaje> mensaje) {
        this.mensaje = mensaje;
    }

}
