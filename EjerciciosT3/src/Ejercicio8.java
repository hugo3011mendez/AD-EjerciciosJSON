import javax.json.*;
import java.time.*;
import java.time.format.*;

public class Ejercicio8 {
    /**
     * Convierte una fecha a String
     * 
     * @param unixTime Fecha indicada
     * 
     * @return Cadena con la fecha indicada
     */
    public static String unixTimeToString(long unixTime){
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return Instant.ofEpochSecond(unixTime).atZone(ZoneId.of("GMT+1")).format(formatter);
    }

    public static String[] datosCiudad(String ciudad){
        JsonObject pronostico = Ejercicio1.pronosticoCiudad(ciudad);
        
        String[] datos = new String[5];

        datos[0] = "Fecha : " + unixTimeToString(pronostico.getJsonNumber("df").longValue());
        datos[1] = "Temperatura : " + String.valueOf(pronostico.getJsonNumber("temp").doubleValue())+"ºC";
        datos[2] = "Humedad : " + String.valueOf(pronostico.getJsonNumber("humidity").intValue())+"%";
        datos[3] = "Probabilidad de nubes : " + String.valueOf(pronostico.getJsonNumber("all").intValue())+"%";
        datos[4] = "Velocidad del viento : " + String.valueOf(pronostico.getJsonNumber("speed").doubleValue())+"Km/h";

        return datos;
    }
}
