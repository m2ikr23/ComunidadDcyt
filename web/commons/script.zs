import dao.UsuarioDAO;
import dao.hibernate.HibernateDAO;
import dao.hibernate.IHibernateDAO;
import dao.implementacion.UsuarioDAOImpHibernate;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
IHibernateDAO hibernateDAO = new HibernateDAO();
  hibernateDAO.setSessionFactory(sessionFactory);
        UsuarioDAO usuario = new UsuarioDAOImpHibernate();
        usuario.setHibernateDAO(hibernateDAO);