import java.util.Scanner;

public class ClassificacaoTriangulo {
   
    final static Scanner teclado = new Scanner(System.in);
    
    public static double lerValorReal(){
        double valor;
        valor = teclado.nextDouble();
        return valor;
    }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Digite os três lados do triângulo:");
            System.out.print("Lado A: ");
            double ladoA = scanner.nextDouble();
            
            System.out.print("Lado B: ");
            double ladoB = scanner.nextDouble();
            
            System.out.print("Lado C: ");
            double ladoC = scanner.nextDouble();


        if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0){
            System.out.println("Os lados do triângulo devem ser positivos!");
        } else if (ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA){
            System.out.println("Os valores fornecidos não formam um triângulo válido!");
        } else {
            // Classificar o triângulo
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Triângulo Equilátero (todos os lados iguais)");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("Triângulo Isósceles (dois lados iguais)");
            } else {
                System.out.println("Triângulo Escaleno (todos os lados diferentes)");
            }
        }

        }
}
