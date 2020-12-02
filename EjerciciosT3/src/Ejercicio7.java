import javax.json.*;

public class Ejercicio7 {
    /**
     * Calculo las coordenadas de una ciudad indicada en OpenWeather API
     * 
     * @param ciudad Ciudad sobre la que se quiere saber las coordenadas
     * 
     * @return Matriz con la longitud y la latitud de la ciudad indicada
     */
    public static double[] coordenadasDeCiudad(String ciudad){
        double[] coordenadas = new double[2];
        JsonObject pronostico = Ejercicio1.pronosticoCiudad(ciudad);

        coordenadas[0] = pronostico.getJsonNumber("lon").doubleValue();
        coordenadas[1] = pronostico.getJsonNumber("lat").doubleValue();

        return coordenadas;
    }    
}
