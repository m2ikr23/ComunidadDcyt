/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.hibernate.IHibernateDAO;
import dto.Imagen;

/**
 *
 * @author maike
 */
public abstract interface ImagenDao {
       
    public void registrarImagen(Imagen image) throws Exception;
    public void setHibernateDAO(IHibernateDAO hibernateDAO);
    public Imagen buscarImagenPorNombre(String nombre);
}
