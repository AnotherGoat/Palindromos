public class Palindromo {

    // Constructor
    public Palindromo() {
    }

    public boolean esPalindromo(String palabra){
        palabra = revisarString(palabra);

        if(palabra.equals("")){ // Caso de String vacío
            return false;
        }
        else if(palabra.length()==1){ // En caso de ingresar solo 1 letra o símbolo
            return false;
        }
        else {
            String palabraAux = "";

            for (int i = palabra.length() - 1; i >= 0; i--) {
                char caracter = palabra.charAt(i);
                palabraAux += caracter;
            }
            return palabra.equals(palabraAux);
        }
    }
    
    private String revisarString(String a){

        // Elimina los espacios
        a = a.replace(" ", "");

        // Reemplaza mayúsculas por minúsculas
        String[] mayusculas = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] minusculas = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for(int i=0; i<mayusculas.length; i++){
            a = a.replace(mayusculas[i], minusculas[i]);
        }

        // Elimina las tildes/diéresis
        String[] conTildes = {"Á", "á", "É", "é", "Í", "í", "Ó", "ó", "Ú", "ú", "Ü", "ü"};
        String[] sinTildes = {"a", "a", "e", "e", "i", "i", "o", "o", "u", "u", "u", "u"};
        for(int i=0; i<conTildes.length; i++){
            a = a.replace(conTildes[i], sinTildes[i]);
        }

        return a;
    }
}
