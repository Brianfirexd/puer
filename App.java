import java.util.ArrayList;
import java.util.Scanner;

public class App extends Producto {


    public static Scanner leer = new Scanner(System.in);
    public static ArrayList <Producto> productos = new ArrayList<Producto>();


    public static void main(String[] args) throws Exception {

        boolean salir = true;


        do {

            System.out.println("Seleccione una opcion. ");
            System.out.println("1.Agregar. ");
            System.out.println("2.Mostrar Catalogo. ");
            System.out.println("3.Buscar");
            System.out.println("4.Modificar");
            System.out.println("5.Eliminar");
            System.out.println("6.Salir");
            int op = leer.nextInt();
            leer.nextLine();


            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 6:
                salir = false;
                    break;
                default:
                    break;
            }
            
        } while (salir);


    }
    public static void AddProduct(){

    }
    public static void MostrarCatalogo(){
        for (Pro pro : pro) {
               //comodin
        }
    }
}
