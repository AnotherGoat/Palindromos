public class Palindromo {

    String cadena;

    // Constructor
    public Palindromo(String cadena) {
        this.cadena = cadena;
    }

    public boolean esPalindromo(String cadena){
        String resultado = "";
        int largo = cadena.length();
        char[] arreglo;
        arreglo = new char[largo];

        // Separa la cadena en un arreglo de caracteres
        for (int i=0; i<largo; i++){
            arreglo[i] = cadena.charAt(i);
        }

        // Invierte la cadena original
        for (int i=0; i<largo/2; i++){
            char aux = arreglo[i];
            arreglo[i] = arreglo [largo-1-i];
            arreglo[largo-1-i] = aux;
        }

        // Vuelve a unir la cadena invertida
        for (int i=0; i<largo; i++){
            resultado += arreglo[i];
        }

        return cadena.equals(resultado);
    }
}
