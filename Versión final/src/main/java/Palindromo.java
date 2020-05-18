public class Palindromo {

    // Constructor
    public Palindromo() {
    }

    public boolean esPalindromo(String palabra){
        String palabraAux = "";

        for (int i=palabra.length()-1; i>=0; i--){
            char caracter = palabra.charAt(i);
            palabraAux += caracter;
        }

        return palabra.equals(palabraAux);
    }
    
    private String revisarString(String a){
        return a;
    }
}
