package refactorizame;

import java.util.Scanner;

public class Refactorizame
{
    public static void main(String[] args)
    {
    Calculos operacion = new Calculos();
    Scanner leer = new Scanner ( System.in );
    final double PI = 3.1415;
    int opcionMenu;
    double resultado;
    int numero;
    
    
    int hola;

    do{
         opcionMenu = menu(leer);
        switch(opcionMenu)
        {
            case 1:
                resultado = operacion.doblePi(PI);
                mostrarResultado(resultado);
                break;
            case 2:
                System.out.println("\nIntroduzca un numero: ");
                numero = leer.nextInt();
                resultado = operacion.Operaciones(numero);
                mostrarResultado(resultado);
                break;
            case 3:
                operacion.CalculosPI(PI);
                break;
        }

        }while(opcionMenu != 0);
    }


    
    public static void mostrarResultado(double resultado) {
        System.out.println();
        System.out.println("La visualización del resultado es");
        System.out.println("---------------------------------");
        System.out.println("Para ello tenemos que visualizar los valores");
        System.out.println("--------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("Resu: "+ resultado);
    }

    public static int menu(Scanner leer) {
        int opcionMenu;
        System.out.println("1.- calcular Pi al cuadrado");
        System.out.println("2.- Operacion con un numero");
        System.out.println("3.- Calculos con PI");
        System.out.println("0.- Salir");
        System.out.println("Opción: ");
        opcionMenu = leer.nextInt();
        return opcionMenu;
    }

   
}
