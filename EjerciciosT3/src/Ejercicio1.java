import javax.json.*;

public class Ejercicio1 {
    /**
     * Devuelve como JsonObject el pronóstico meteorológico de una ciudad que se le pasa como parámetro
     * 
     * @param ciudad La ciudad sobre la que se va a calcular el pronóstico
     * 
     * @return El JsonObject conteniendo el pronóstico
     */
    public static JsonObject pronosticoCiudad(String ciudad){
        return (JsonObject) Jsonn.leeJSON("http://api.openweathermap.org/data/2.5/weather?q=" + ciudad.toLowerCase() + ",es&lang=es&units=metric&APPID=8f8dccaf02657071004202f05c1fdce0");
    }
}
