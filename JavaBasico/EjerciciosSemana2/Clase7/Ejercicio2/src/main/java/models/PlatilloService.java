package models;

import persistance.ControladoraPersistencia;
import persistance.PlatilloJpaController;

/**
 *
 * @author Alfonso Márquez Gil
 */
public class PlatilloService
{

    private ControladoraPersistencia platilloDAO = new ControladoraPersistencia();

    public void agregarNuevoPlatillo(Platillo platillo)
    {
        platilloDAO.agregarPlatillo(platillo);
    }

}
