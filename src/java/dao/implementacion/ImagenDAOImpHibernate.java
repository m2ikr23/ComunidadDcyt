/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.implementacion;

import dao.hibernate.IHibernateDAO;
import dao.ImagenDao;
import dto.Imagen;
import java.util.List;

/**
 *
 * @author maike
 */
public class ImagenDAOImpHibernate implements ImagenDao{
    IHibernateDAO hibernateDAO;

    public IHibernateDAO getHibernateDAO() {
        return hibernateDAO;
    }
   @Override
    public void setHibernateDAO(IHibernateDAO hibernateDAO) {
        this.hibernateDAO = hibernateDAO;
    }  

    @Override
    public void registrarImagen(Imagen image) throws Exception {
   
        if(image.getImage()== null){
            throw new Exception("Debe llenar todo los capos señalados");
            }else{
                hibernateDAO.saveOrUpdate(image);
             } }

    @Override
    public Imagen buscarImagenPorNombre(String nombre) {
        return (Imagen) hibernateDAO.findByKey(Imagen.class, nombre); }
     
    


}
