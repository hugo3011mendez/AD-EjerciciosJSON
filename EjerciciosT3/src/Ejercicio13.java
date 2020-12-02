import javax.json.*;

public class Ejercicio13 {
    public static void trivia(){
        JsonObject trivial = (JsonObject) Jsonn.leeJSON("https://opentdb.com/api.php?amount=20&category=18&difficulty=hard");

        JsonArray preguntas = trivial.getJsonArray("results");
        for (JsonValue pregunta : preguntas) {
            System.out.println(((JsonObject)pregunta).getString("question"));
            System.out.println("*\t" + ((JsonObject)pregunta).getString("correct_answer"));

            JsonArray respuestasIncorrectas = ((JsonObject)pregunta).getJsonArray("incorrect_answers");
            for (JsonValue respuesta : respuestasIncorrectas) {
                System.out.println(respuesta.toString().substring(1, respuesta.toString().length()-1)); // Así le quito las comillas
            }

            System.out.println();
            System.out.println();
        }
    } 
}
