import java.util.Scanner;


public class AreaTrapezio {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);  
    }


    public static String lerTexto(){
        String texto;
        texto = tecladoScanner.nextLine();
        return texto;
    }

    public static double lerChar(){
        char caracter;
        caracter = tecladoScanner.next().charAt(0);
        return caracter;
    }

    public static double lerValorReal(){
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;    
    }

    public static int lerValorInteiro(){
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }
    
    public static double calcularAreaTrapezio(double baseMenor, double baseMaior, double altura){
        double resultado;
        resultado = ((baseMaior + baseMenor) * altura)/2;
        return resultado;
    }

    public static void main(String[] args){
        double areaTrapezio = 0;
        double baseMaior = 0;
        double baseMenor = 0;
        double altura = 0;
        String saida = null;
        
        // entrada
        imprimir("Informe a base maior");
        baseMaior = lerValorReal();
        imprimir("Informe a base menor");
        baseMenor = lerValorReal();
        imprimir("Informe a altura");
        altura = lerValorReal();

        // processamento
        areaTrapezio = calcularAreaTrapezio(baseMaior, baseMenor, altura);

        // saida
        saida = "A area do trapezio é: "+ areaTrapezio;
        imprimir(saida);

    }

   
}
