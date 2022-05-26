package LaAlcarria;
import java.util.ArrayList;
import java.util.Scanner;

public class CasasAlcarria {
    
    public static void main(String [] args){
        ArrayList<CasaRural> lista_casarural = new ArrayList<>();
        Scanner opcion = new Scanner(System.in);
        String eleccion = "0";

        System.out.print("\033[H\033[2J");
        System.out.println("Bienvenido!");
        
        do{
            opcionesMenu();
            eleccion = opcion.nextLine();
            switch(eleccion){
                case "1":
                    lista_casarural.add(new CasaRural());
                    break;
                default:
                    if(!eleccion.equals("3")){
                        System.out.print("\033[H\033[2J");
                        System.out.println("Ingrese una opcion valida");
                    }
                    break;
            }

        }while(!eleccion.equals("3"));

        System.out.print("\033[H\033[2J");
        System.out.println("See u next time!");
        opcion.close();
    }

    public static void opcionesMenu(){
        System.out.println("Elija una opcion!");
        System.out.println("1: Ingresar");
        System.out.println("2: Mostrar");
        System.out.println("3: Finalizar");
    }
}
