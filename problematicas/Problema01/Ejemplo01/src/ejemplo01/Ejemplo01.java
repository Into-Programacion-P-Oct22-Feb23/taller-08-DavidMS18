/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String posicion;
        String cadena = "";
        String listaEdad = "";
        int edad;
        int iteracion;
        float promedioEdad;
        float promedioEstatura;
        float estatura;
        float sumaEdad = 0;
        float sumaEstatura = 0;
        
        System.out.println("Ingrese el numero de jugadores que sea guardar la informacion: ");
        iteracion =  entrada.nextInt();
        
        for (int i = 1; i <= iteracion; i++) {
            
            entrada.nextLine();
            System.out.println("Ingrese el nombre del jugador: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posicion del jugador: ");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador: ");
            estatura = entrada.nextFloat();
            
            cadena = cadena + i + "." + nombre + "-" + posicion 
                    + "-, edad " + edad + ", estatura" + estatura + "\n";
            listaEdad = listaEdad + " " + edad;
            sumaEdad = sumaEdad + edad;
            sumaEstatura = sumaEstatura + estatura;
        }
        
        promedioEdad = sumaEdad / iteracion ;
        promedioEstatura = sumaEstatura / iteracion;
        
        System.out.printf("Listado de jugadores\n\n%s", cadena);
        System.out.printf("Listado de edades %s\n", listaEdad);
        System.out.printf("Promedio de edades: %.2f\n", promedioEdad);
        System.out.printf("Promedio de estaturas: %.2f\n", promedioEstatura);

    }
    
}
