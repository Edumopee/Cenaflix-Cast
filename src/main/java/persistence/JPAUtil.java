
package persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *essa classe no instaciamos o entitymanager e apontamos para o documento xml jpa
 * @author Eduardo
 */
public class JPAUtil {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("cenaflixPU");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public static void close() {
        emf.close();
    }
}
