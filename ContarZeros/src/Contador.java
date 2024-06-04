public class Contador {
    public static void main(String[] args) {
        int n = 102030;
        int resultado = contarZeros(n);
        System.out.println("Resultado" + resultado);
    }
    private static int contarZeros(int n){
        //caso base
        if(n == 0)
            return 0;
        int ultimoDigito = n % 10;
        if (ultimoDigito == 0){
            return 1 + contarZeros(n / 10);
        }else{
            return contarZeros(n / 10);
        }
    }
}
