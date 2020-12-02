import javax.json.*;

public class Ejercicio6 {
    /**
     * Calcula el pronóstico de una ciudad dada su ID
     * 
     * @param id ID de la ciudad sobre la que queremos saber el pronóstico
     * 
     * @return JsonObject conteniendo el pronóstico meteorológico
     */
    static JsonObject pronosticoID(int id){
        return (JsonObject) Jsonn.leeJSON("http://api.openweathermap.org/data/2.5/weather?id="+ id + "&lang=es&APPID=8f8dccaf02657071004202f05c1fdce0");
    }


    /**
     * Calcula el nombre de la ciudad dada su ID en OpenWeather API
     * 
     * @param id ID de la ciudad sobre la que queremos saber el nombre
     * 
     * @return Nombre de la ciudad que queremos conocer
     */
    public static String nombreDeCiudad(int id){
        return pronosticoID(id).getString("name");
    }
}
