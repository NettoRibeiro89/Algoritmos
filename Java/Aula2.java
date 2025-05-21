import java.util.Scanner;

public class Aula2 {
    
    final static Scanner teclado = new Scanner(System.in);
    
    public static void imprimir(String texto) {
        System.out.println(texto);  
    }

    public static void processar(int inicio, int fim) {
        int i = 0;
        String texto;

        for(i=inicio; i <= fim; i=i+1){
            texto = "" + i;
            imprimir(texto);
        }

    }

    public static void main(String[] args) {
        // Variaveis
        int inicio = 0;
        int fim = 0;

        // Leitura de Valores
        imprimir("Valor Inicial: ");
        inicio = teclado.nextInt();
        imprimir("Valor Final: ");
        fim = teclado.nextInt();
        
        // Processamento
        processar(inicio, fim);
    }

}