import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Punto1 {
    Scanner sc = new Scanner(System.in);

    public void Elementos(int dim) {
        int[][] Matriz = new int[dim][dim];
        int opt = 0;
        Stack<Integer> Sumita = new Stack<>();
        Queue<Integer> Sumita2 = new LinkedList<>();
        System.out.println("Ingrese los elementos de la matriz ");
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                Matriz[i][j] = sc.nextInt();

            }

        }
        //sumita para filas (pilas)
        Stack<Integer> pila = new Stack<>();
        for (int[] fila : Matriz) {
            int suma = 0;
            for (int valor : fila) {
                suma += valor;
            }
            pila.push(suma);
            System.out.println("Suma de las filas (pila): " + suma);
        }

        //sumita para columnas (colas)
        Queue<Integer> colita = new LinkedList<>();
        int n = Matriz.length;
        for (int col = 0; col < n; col++) {
            int suma = 0;
            for (int fila = 0; fila < n; fila++) {
                suma += Matriz[fila][col];
            }
            colita.add(suma);
            System.out.println("Suma de las columnas (cola) : " + suma);
        }
        //factorial de la dim de la matriz
            int factorial = factorial(dim);
            System.out.println("Factorial de " + dim + ": " + factorial(dim));

            //mostrar los valores de la cola en orden descendiente
            List<Integer> listaaa = new ArrayList<>(colita);
            Collections.sort(listaaa, Collections.reverseOrder());
            System.out.println("La colita organizada en mayor a menor: " + listaaa);


        }
    public static int factorial (int dim){
        if (dim == 0 || dim == 1)
            return 1;
        else {
            return dim * factorial(dim - 1);

        }
    }

    }

