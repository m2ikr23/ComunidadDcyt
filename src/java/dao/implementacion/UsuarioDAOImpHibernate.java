package dao.implementacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;

import dao.hibernate.HibernateDAO;
import dao.hibernate.IHibernateDAO;
import dao.UsuarioDAO;
import dto.Amigo;
import dto.Usuario;

/**
 *
 * @author Desire
 */
public class UsuarioDAOImpHibernate implements UsuarioDAO{
 IHibernateDAO hibernateDAO;

    public IHibernateDAO getHibernateDAO() {
        return hibernateDAO;
    }
   @Override
    public void setHibernateDAO(IHibernateDAO hibernateDAO) {
        this.hibernateDAO = hibernateDAO;
    }  
     
    
    @Override
    public void registrarUsuario(Usuario usuario) throws Exception {
    
        if(usuario.getCedula() == null || usuario.getNombre() == null || usuario.getCorreo() == null){
            throw new Exception("Debe llenar todo los capos señalados");
            }else{
                hibernateDAO.saveOrUpdate(usuario);
             }
    
    }

   

    @Override
    public Usuario buscarUsuarioPorCedula(String cedula) {
        return (Usuario) hibernateDAO.findByKey(Usuario.class, cedula);
    }

    @Override
    public List buscarUsuarios() {
       return hibernateDAO.loadAll(Usuario.class);
    }

    @Override
    public List BuscarAmigosDeUsuario(String idUsuario) {
    return hibernateDAO.findBySQLQuery("select idAmigo,nombre from usuarioAmigo , amigo , usuario where"
            + "usuario.id = usuarioAmigo.idUsuario and usuarioAmigo.idAmigo=amigo.id");
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registrarAmigo(Amigo amigo) {
   hibernateDAO.saveOrUpdate(amigo);
    }
   
}
