package dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;

import dao.hibernate.IHibernateDAO;
import dto.Amigo;
import dto.Usuario;

/**
 *
 * @author Desire
 */
public abstract interface UsuarioDAO{
    
    public void registrarUsuario(Usuario usuario) throws Exception;
    public void setHibernateDAO(IHibernateDAO hibernateDAO);
    public Usuario buscarUsuarioPorCedula(String cedula);
    public List buscarUsuarios();
    public List BuscarAmigosDeUsuario(String idUsuario);
    public void actualizarUsuario(Usuario usuario);
    public void registrarAmigo(Amigo amigo);
}
