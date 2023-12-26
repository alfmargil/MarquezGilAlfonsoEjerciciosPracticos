package persistance;

import javax.persistence.EntityManager;
import models.Platillo;

/**
 *
 * @author Alfonso Márquez Gil
 */
public class ControladoraPersistencia
{

    EntityManager entityManager = PlatilloJpaController.getEntityManager();

    public void agregarPlatillo(Platillo platillo)
    {
        entityManager.getTransaction().begin();
        entityManager.persist(platillo);
        entityManager.getTransaction().commit();
    }
    
    public Platillo obtenerPlatillo(Long id)
    {
        return entityManager.find(Platillo.class, id);
    }

}
