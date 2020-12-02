import javax.json.*;

public class Ejercicio2 {
    /**
     * Devuelve el pronóstico de la zona indicada mediante valores de longitud y latitud
     * 
     * @param longitud Longitud del punto sobre el que queremos saber el pronóstico
     * @param latitud Latitud del punto sobre el que queremos saber el pronóstico
     * 
     * @return JsonObject conteniendo el pronóstico de la zona indicada
     */
    public static JsonObject pronosticoLatLong(double longitud, double latitud){
        return (JsonObject) Jsonn.leeJSON("http://api.openweathermap.org/data/2.5/weather?lat=" + latitud +"&lon=" + longitud +"&units=metric&APPID=8f8dccaf02657071004202f05c1fdce0");
    }
}
