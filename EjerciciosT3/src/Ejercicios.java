import javax.json.*;
import java.util.Scanner;

public class Ejercicios {
    static void muestraEjercicio(int num){
        switch (num) {
            case 5:
                System.out.println("La ID de la ciudad indicada es : " + Ejercicio5.idDeCiudad("Vigo"));
            break;
            
            case 6:
                System.out.println("El nombre de la ciudad asociado a la ID indicada es : " + Ejercicio6.nombreDeCiudad(34));
            break;

            case 7:
                double[] coordenadas = Ejercicio7.coordenadasDeCiudad("Vigo");
                System.out.println("Las coordenadas de Vigo son :");
                System.out.println("Longitud : " + coordenadas[0]);
                System.out.println("Latitud : " + coordenadas[1]);
            break;

            case 8:
                String[] datos = Ejercicio8.datosCiudad("Vigo");
                for (int i = 0; i < datos.length; i++) {
                    System.out.println(datos[i]);
                }
            break;
            
            case 13:
                Ejercicio13.trivia();
            break;
            
            
            default:
                System.out.println("No se encuentra ese ejercicio");
            break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        muestraEjercicio(14);
    }
}
