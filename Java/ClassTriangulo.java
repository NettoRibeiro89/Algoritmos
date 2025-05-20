import java.util.Scanner;

public class ClassTriangulo {

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
    public static String classificarTriangulo(double ladoA, double ladoB, double ladoC){
        
        String tipoTriangulo = "";
        if(ladoA == ladoB && ladoB == ladoC){
            tipoTriangulo = "Equilatero";
        } else
        if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC){
            tipoTriangulo = "Escaleno";
        } else{
            tipoTriangulo = "Isoceles";
        }
        return tipoTriangulo;
    }

    public static void main (String[] args){

        double ladoA = 0;
        double ladoB = 0;
        double ladoC = 0;
        String tipoTriangulo;
        String saida;

        //Entrada de Dados
        imprimir("Informe o primeiro lado do triangulo");
        ladoA = lerValorReal();

        imprimir("Informe o segundo lado do triangulo");
        ladoB = lerValorReal();

        imprimir("Informe o terceiro lado do triangulo");
        ladoC = lerValorReal();


        // Processamento
        tipoTriangulo = classificarTriangulo(ladoA, ladoB, ladoC);
        
        //Saida
        saida = "O triangulo é "+ tipoTriangulo;
        imprimir(saida);
            

    }
}
