
package persistence;

import com.mycompany.model.Usuarios;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceException;




/**
 *essa classe controla a conexão via jpa com o bd da tabela usuarios
 * @author Eduardo
 */
public class UsuariosDAO {

   public Usuarios autenticar(String login, String senha) {
    EntityManager em = JPAUtil.getEntityManager();
    try {
        Usuarios usuario = em.createQuery(
            "SELECT u FROM Usuarios u WHERE u.usuario = :login AND u.senha = :senha", Usuarios.class)
            .setParameter("login", login)
            .setParameter("senha", senha)
            .getSingleResult();
        
        //adicionei essa linha para ver qual retono de usuario
        System.out.println("DAO retornou: " + usuario.getTipoUsuario());
        
        return usuario;
    } catch (NoResultException e) {
        return null;
    } finally {
        em.close();
    }
}
}