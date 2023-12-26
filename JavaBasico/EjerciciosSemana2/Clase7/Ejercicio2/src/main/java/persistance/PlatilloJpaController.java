package persistance;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Alfonso Márquez Gil
 */
public class PlatilloJpaController implements Serializable
{

    private static final String PERSISTENCE_UNIT_NAME = "EjercicioJPAPU";
    private static EntityManagerFactory factory;

    public static EntityManager getEntityManager()
    {
        if (factory == null) {
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return factory.createEntityManager();
    }

    public static void closeEntityManagerFactory()
    {
        if (factory != null && factory.isOpen()) {
            factory.close();
        }
    }

}
