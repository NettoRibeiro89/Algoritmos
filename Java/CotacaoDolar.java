import java.util.Scanner;

public class CotacaoDolar {

    final static Scanner teclado = new Scanner(System.in);

    // Leitura de um valor do tipo Real
    public static double lerValorReal(){
        double valor;
        valor = teclado.nextDouble();
        return valor;
    }

    // Recebe um texto e mostra na tela
    public static void imprimir(String texto){
        System.out.println(texto);
    }

    // Calcula o valor em reais a partir do valor em dolares e a cotacao
    public static double calcularDolarReal(double cotacaoDolar, double valorDolares){
        double valorReais;
        valorReais = cotacaoDolar * valorDolares;
        return valorReais;
    }

    public static void main (String[] args){

        double cotacaoDolar = 0;
        double valorDolares = 0;
        double valorReais = 0;
        String saida;

        //Entrada de Dados
        imprimir("Informe a cotação do dólar");
        cotacaoDolar = lerValorReal();

        imprimir("Informe a quantidade de dolares");
        valorDolares = lerValorReal();

        // Processamento
        valorReais = calcularDolarReal(cotacaoDolar, valorDolares);
        
        //Saida
        saida = "O valor em reais é "+valorReais;
        imprimir(saida);
            

    }
}
