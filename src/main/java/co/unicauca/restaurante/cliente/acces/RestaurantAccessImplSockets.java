package co.unicauca.restaurante.cliente.acces;

import co.unicauca.restaurante.comunicacion.domain.Restaurant;
import co.unicauca.restaurante.cliente.infra.RestaurantSocket;
import co.unicauca.restaurante.comunicacion.infra.JsonError;
import co.unicauca.restaurante.comunicacion.infra.Protocol;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class RestaurantAccessImplSockets implements IRestaurantAccess{
    /**
    * El servicio utiliza un socket para comunicarse con la aplicación server
    */
    private RestaurantSocket mySocket;

    public RestaurantAccessImplSockets() {
        mySocket = new RestaurantSocket();
    }
    
    /**
     * Crea una solicitud json para ser enviada por el socket
     *
     *
     * @param idRestaurant identificación del Restaurante
     * @return solicitud de consulta del Restaurante en formato Json, algo como:
     * {"resource":"Restaurante","action":"get","parameters":[{"RestNombre":"id","value":"98000001"}]}
     */
    private String findRestaurantRequestJson(String idRestaurant) {

        Protocol protocol = new Protocol();
        protocol.setResource("Restaurante");
        protocol.setAction("get");
        protocol.addParameter("RestNombre", idRestaurant);

        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);

        return requestJson;

    }

    /**
     * Extra los mensajes de la lista de errores
     *
     * @param jsonResponse lista de mensajes json
     * @return Mensajes de error
     */
    private String extractMessages(String jsonResponse) {
        JsonError[] errors = jsonToErrors(jsonResponse);
        String msjs = "";
        for (JsonError error : errors) {
            msjs += error.getMessage();
        }
        return msjs;
    }

    /**
     * Convierte el jsonError a un array de objetos jsonError
     *
     * @param jsonError
     * @return objeto MyError
     */
    private JsonError[] jsonToErrors(String jsonError) {
        Gson gson = new Gson();
        JsonError[] error = gson.fromJson(jsonError, JsonError[].class);
        return error;
    }

    /**
     * Convierte jsonRestaurant, proveniente del server socket, de json a un
     * objeto Restaurant
     *
     * @param jsonRestaurant objeto cliente en formato json
     */
    private Restaurant jsonToRestaurant(String jsonRestaurant) {

        Gson gson = new Gson();
        Restaurant restaurant = gson.fromJson(jsonRestaurant, Restaurant.class);

        return restaurant;
    }
    
    private String findAllRestaurantRequestJson() {

        Protocol protocol = new Protocol();
        protocol.setResource("Restaurante");
        protocol.setAction("gets");
        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);
        System.out.println("json: " + requestJson);

        return requestJson;
    }
    
    private String createRestaurantRequestJson(Restaurant restaurant) {

        Protocol protocol = new Protocol();
        protocol.setResource("Restaurante");
        protocol.setAction("post");
        protocol.addParameter("RestId", restaurant.getResID());
        protocol.addParameter("RestNombre", restaurant.getResName());
        protocol.addParameter("RestDireccion", restaurant.getResAddress());
        protocol.addParameter("RestTematicaComida", restaurant.getResDescFood());

        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);
        System.out.println("json: " + requestJson);

        return requestJson;
    }
    
    @Override
    public Restaurant findRestaurant(String id) throws Exception {
        String jsonResponse = null;
        String requestJson = findRestaurantRequestJson(id);

        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();
        } catch (IOException ex) {
            Logger.getLogger(RestaurantAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor. Revise la red o que el servidor este escuchando");
        } else {
            if (jsonResponse.contains("error")) {
                //Devolvio algun error
                Logger.getLogger(RestaurantAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {
                //Encontro el Restaurant
                Restaurant restaurant = jsonToRestaurant(jsonResponse);
                return restaurant;
            }
        }
    }
    @Override
    public String createRestaurant(Restaurant restaurant) throws Exception {
                String jsonResponse = null;
        String requestJson = createRestaurantRequestJson(restaurant);
        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();

        } catch (IOException ex) {
            Logger.getLogger(RestaurantAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor");
        } else {

            if (jsonResponse.contains("error")) {
                //Devolvió algún error                
                Logger.getLogger(RestaurantAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {
                //Agregó correctamente, devuelve el id del restaurante 
                return restaurant.getResID()+ "";
            }

        }
    }  
    
    private List<Restaurant> jsonToListRestaurant(String jsonRestaurant) {
        Gson gson = new Gson();

        java.lang.reflect.Type listType = new TypeToken<List<Restaurant>>() {
        }.getType();

        List<Restaurant> listRestaurant = gson.fromJson(jsonRestaurant, listType);

        return listRestaurant;
    }
    
    @Override
    public List<Restaurant> ListRestaurant() throws Exception {
        String jsonResponse = null;
        String requestJson = findAllRestaurantRequestJson();

        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();
        } catch (IOException ex) {
            Logger.getLogger(RestaurantAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor. Revise la red o que el servidor este escuchando");
        } else {
            if (jsonResponse.contains("error")) {
                //Devolvio algun error
                Logger.getLogger(RestaurantAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {
                //Encontro el Restaurant
                List<Restaurant> restaurant = jsonToListRestaurant(jsonResponse);
                return restaurant;
            }
        }
    }
    
}
