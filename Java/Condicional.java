import java.util.Scanner;

public class Condicional {

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
        int qntLivros = 0;
        imprimir("Informe a quantidade de livros:");
        qntLivros = lerValorInteiro();

        if(qntLivros < 5) {
            imprimir("Categoria 1");
        }else if(qntLivros > 10){
            imprimir("Categoria 3");
        }else{
            imprimir("Categoria 2");
        }     
    
        imprimir("Acabou programa.");
    }

}