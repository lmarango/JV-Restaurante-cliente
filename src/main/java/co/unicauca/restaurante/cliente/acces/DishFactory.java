package co.unicauca.restaurante.cliente.acces;

import co.unicauca.restaurante.comunicacion.infra.Utilities;

/**
 *
 * @author HP
 */
public class DishFactory {
    private static DishFactory instance;

    private DishFactory() {
    }

    /**
     * Clase singleton
     *
     * @return
     */
    public static DishFactory getInstance() {

        if (instance == null) {
            instance = new DishFactory();
        }
        return instance;

    }

    /**
     * Método que crea una instancia concreta de la jerarquia IDishService
     *
     * @return una clase hija de la abstracción IRepositorioDish
     */
    public IDishAccess getDishService() {

        IDishAccess result = null;
        String type = Utilities.loadProperty("plate.service");

        switch (type) {
            case "default":
                result = new DishAccessImplSockets();
                break;
        }

        return result;

    }
}
