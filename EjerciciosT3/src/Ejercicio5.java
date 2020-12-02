import javax.json.*;

public class Ejercicio5 {
    /**
     * Calcula la ID de la ciudad indicada en OpenWeather API
     * 
     * @param ciudad La ciudad indicada sobre la que se quiere saber su ID
     * 
     * @return La ID de la ciudad indicada
     */
    public static int idDeCiudad(String ciudad){
        return Ejercicio1.pronosticoCiudad(ciudad).getInt("id");
    }
}
