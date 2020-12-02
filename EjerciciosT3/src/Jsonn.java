import javax.json.*;
import javax.net.ssl.*;
import java.net.URL;
import java.io.*;

public class Jsonn {
    public static JsonValue leeJSON(String ruta) {
        JsonReader reader=null;
        JsonValue jsonV=null;

        try {
            if (ruta.toLowerCase().startsWith("http://")){
                URL url = new URL(ruta);
                InputStream is = url.openStream();
                reader = Json.createReader(is);
            } else if (ruta.toLowerCase().startsWith("https://")) {
                URL url = new URL(ruta);
                HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
                InputStream is = conn.getInputStream();
                reader = Json.createReader(is);
            } else {
                reader = Json.createReader(new FileReader(ruta));
            }

            jsonV = reader.read();

            /* JsonStructure jsonSt = reader.read();
            System.out.println(jsonSt.getValueType());
            JsonObject jsonObj = reader.readObject();
            System.out.println(jsonObj.getValueType());
            JsonArray jsonArr = reader.readArray();
            System.out.println(jsonArr.getValueType()); */

        } catch (IOException e){
            System.out.println("Error procesando documento Json "+ e.getLocalizedMessage());
        }

        if (reader!=null) reader.close();

        return jsonV;
    }
}