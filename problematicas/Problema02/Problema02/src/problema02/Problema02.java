/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author DELL
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero = 25;
        int numeroDos;
        int numeroTres;
        int numeroCuatro;
        int contador;
        String mensaje = "";
        mensaje = mensaje + "N°\tx2\tx3\tx4\n";
        
        for(contador = 25; contador >= 1; contador--){
            numeroDos = numero * 2;
            numeroTres = numero * 3;
            numeroCuatro = numero * 4;
            mensaje = String.format("%s%d\t%d\t%d\t%d\n", mensaje,
                    numero, numeroDos, numeroTres, numeroCuatro);
            numero--;
            numeroDos--;
            numeroTres--;
            numeroCuatro--;
        }
        System.out.println(mensaje);   

    }
    
}
