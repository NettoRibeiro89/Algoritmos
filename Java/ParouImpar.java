import java.util.Scanner;

public class ParouImpar {

    public static Scanner tecladoScanner = new Scanner(System.in);

    // método que recebe um texto e imprime na tela
    public static void imprimir(String texto){ 
        System.out.println(texto);
    } 

    public static double lerValorReal(){
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static int lerValorInteiro(){
        int valor;
        valor  = tecladoScanner.nextInt();
        return valor;
    }

    //public static void main(String[] args) {
    //   int nota = 0;

    //    imprimir("informe a nota");
    //    nota = lerValorInteiro();

    //    if( nota >= 7 ){
    //       imprimir("Passou!!!");
    //    } else {
    //       imprimir("Não passou!!!");
    //}

    public static void main(String[] args){
        int numero = 0;
        imprimir("Informe numero inteiro:");
        numero = lerValorInteiro();

        String posNeg = "neutro";
        String parImp = null;
        
        if(numero != 0 ) {
            if (numero > 0) {
                posNeg = "Positivo";
            }else{
                posNeg = "Negativo";

            }
        }
        if(numero%2 ==0){
            parImp = "Par";
        }else{
            parImp = "Impar";
        }
        imprimir(posNeg);
        imprimir(parImp);


        imprimir("Acabou programa.");
    }

}