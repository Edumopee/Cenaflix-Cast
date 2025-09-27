
package persistence;

import com.mycompany.model.Cadastro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import java.util.List;

/**
 *essa classe controla a conexão via jpa com o bd da tabela casdatro
 * @author Eduardo
 */
public class CadastroDAO {

    public void salvar(Cadastro podcast) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            // Inicia a transação para operações de escrita
            em.getTransaction().begin();
            em.persist(podcast);
            em.getTransaction().commit();
        } finally {
            // Garante que o EntityManager será fechado
            em.close();
        }
    }

    public List<Cadastro> listarTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            // Altere 'Podcast' para 'Cadastro'
            TypedQuery<Cadastro> query = em.createQuery("SELECT c FROM Cadastro c", Cadastro.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public List<Cadastro> listarPorProdutor(String produtor) {
    EntityManager em = JPAUtil.getEntityManager();
    try {
        String jpql = "SELECT c FROM Cadastro c WHERE LOWER(c.produtor) LIKE :produtor";
        
        TypedQuery<Cadastro> query = em.createQuery(jpql, Cadastro.class);
        query.setParameter("produtor", "%" + produtor.toLowerCase() + "%");
        
        return query.getResultList();
    } finally {
        em.close();
    }
}
}
