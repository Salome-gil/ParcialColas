import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion =0;
        while (opcion !=3) {
            String menu = "MENU DE PROYECTOS: \n"
                    + "1. Ejecutar Punto #1 \n"
                    + "2. Ejecutar Punto # \n"
                    + "3. SALIR \n";
            System.out.println(menu);
            System.out.println("Seleccione una opción: ");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    Punto1 p1= new Punto1();
                    System.out.println("Ingrese la dimension de la matriz: ");
                    int dim = sc.nextInt();
                    p1.Elementos(dim);
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        }
    }
}