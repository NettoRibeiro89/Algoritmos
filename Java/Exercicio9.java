import java.util.Scanner;

public class Exercicio9 {

    final static Scanner teclado = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static int intervalo(int inicio, int fim) {
        int i = 0;
        String texto;
        int acumulador = 0;


        for(i=inicio; i <= fim; i=i+1){
            acumulador = acumulador + i;

        }

        return acumulador;
    }


    public static void main(String[] args){
        
        // Variaveis
        int inicio = 0;
        int fim = 0;
        int soma = 0;
        String texto;

        // Leitura de Valores
        imprimir("Valor Inicial: ");
        inicio = teclado.nextInt(); 
        imprimir("Valor Final: ");
        fim = teclado.nextInt();

        // Processamento
        soma = intervalo(inicio, fim);
        for(int i=inicio; i <= fim; i=i+1){
        soma = soma + i;
        }
        imprimir("Soma: " + soma);
        
        // Saida
        texto = "O valor da soma do intervalo de " + inicio + " a " + fim + " é: "+ soma;
        imprimir(texto);
    }
    
}
