package palindromos;

import java.util.Scanner;

/**
 *
 * @author Fabi
 */
public class Palindromos {

    public static void main(String[] args) {
        
        System.out.println("Por favor ingrese una palabra o una frase");
        
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        
        String palabraSinEspacios = texto.replace(" ", "");
        
        StringBuffer sb = new StringBuffer(palabraSinEspacios);
        sb = sb.reverse();
        
        if (palabraSinEspacios.equalsIgnoreCase(sb.toString()))		
            System.out.println(texto + " si es un palindromo");
        else
         System.out.println(texto + " no es un palindromo");
        }    
}