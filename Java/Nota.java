import java.util.Scanner;

public class Nota {

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
        int nota = 0;
        imprimir("Informe sua nota:");
        nota = lerValorInteiro();

        if(nota >= 9) {
            imprimir("Conceito A");
        }else if ( nota >= 8 ){
            imprimir("Conceito B");
        }else if ( nota >= 7 ){
            imprimir("Conceito C");
        }else{
            imprimir("Conceito D");
        }
    
        imprimir("Acabou programa.");
    }

}