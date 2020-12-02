import javax.json.*;

public class Ejercicio3 {
    /**
     * Devuelve un JsonObject con el pronóstico de una cantidad de ciudades indicada cercana al punto indicado
     * 
     * @param longitud Longitud del punto
     * @param latitud Latitud del punto
     * @param cantidad Nº de ciudades que calcular el pronóstico
     * 
     * @return JsonObject con el pronóstico
     */
    public static JsonObject pronosticos(double longitud, double latitud, int cantidad){
        return (JsonObject) Jsonn.leeJSON("http://api.openweathermap.org/data/2.5/find?lat=" + latitud + "&lon=" + longitud + "&cnt=" + cantidad +"&units=metric&APPID=8f8dccaf02657071004202f05c1fdce0"); 
    }
}
