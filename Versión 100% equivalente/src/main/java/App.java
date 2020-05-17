import java.util.Scanner;

public class App {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String s = teclado.nextLine();
        Palindromo p = new Palindromo(s);

        if(p.esPalindromo(s)){
            System.out.println("La palabra ingresada es un palíndromo");
        }
        else{
            System.out.println("La palabra ingresada no es un palíndromo");
        }
    }



}
