/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author maike
 */
@Entity
public class Mensaje implements Serializable {

    @Id
    private int id;
    
    private String fromUser;
    private String toUser;
    private String content;

    @ManyToMany(cascade = {javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinTable(name = "usuarioMensaje", joinColumns = {
        @JoinColumn(name = "idUsuario")}, inverseJoinColumns = {
        @JoinColumn(name = "idMensaje")})
    private Set<Usuario> usuario = new HashSet();

    @Override
    public String toString() {
        return super.toString();
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }


    public void setContent(String content) {
        this.content = content;
    }

    public Set<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(Set<Usuario> usuario) {
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
