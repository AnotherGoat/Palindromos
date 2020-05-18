public class Palindromo {

    // Constructor
    public Palindromo() {
    }

    public boolean esPalindromo(String palabra){
        palabra = revisarString(palabra);

        String palabraAux = "";

        for (int i=palabra.length()-1; i>=0; i--){
            char caracter = palabra.charAt(i);
            palabraAux += caracter;
        }

        return palabra.equals(palabraAux);
    }
    
    private String revisarString(String a){

        // Elimina los espacios
        a = a.replace(" ", "");
        System.out.println(a);

        // Reemplaza mayúsculas por minúsculas
        String[] mayusculas = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] minusculas = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for(int i=0; i<mayusculas.length; i++){
            a = a.replace(mayusculas[i], minusculas[i]);
        }

        return a;
    }
}
