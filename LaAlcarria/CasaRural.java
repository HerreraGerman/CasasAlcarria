package LaAlcarria;
import java.io.*;

public class CasaRural{
private String codigo;
private String poblacion;
private String direccion;
private int numHabitacion = 0;
private double precio = 0.0;
boolean esAlta;

public CasaRural(){
    esAlta = true;
    asigna();
}

public void asigna(){
BufferedReader entrada = new BufferedReader(
new InputStreamReader(System.in));
    try {
        System.out.print("\nCodigo (10 caracteres): ");
        codigo = entrada.readLine();
        System.out.print("\nPoblación: ");
        poblacion = entrada.readLine();
        System.out.print("\nDirección: ");
        direccion = entrada.readLine();
        System.out.print("\nNúmero de habitaciones: ");
        numHabitacion = Integer.parseInt(entrada.readLine());
        System.out.print("\nPrecio por día de estancia: ");
        precio = (new Double(entrada.readLine())).doubleValue();
        System.out.print("\033[H\033[2J");
        muestra();
    }
    catch (IOException e){
        System.out.println(" Excepcion en la entrada de datos " + e.getMessage()+ " . No se da de alta");
        esAlta = false;
    }
}

public String elCodigo(){
    return codigo;
}

public void muestra(){
    System.out.println("Casa Rural " + codigo);
    System.out.println("Población: " + poblacion);
    System.out.println("Dirección: " + direccion);
    System.out.println("Número de habitaciones: " + numHabitacion);
    System.out.println("Precio por día: " + precio);
    }
}