import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.print("Digite o raio da lata (R): ");
            double raio = leitor.nextDouble();
            
            System.out.print("Digite a altura da lata: ");
            double altura = leitor.nextDouble();
            
            // Fórmula: VOLUME = 3.14159 * R^2 * ALTURA
            double volume = 3.14159 * (raio * raio) * altura;
            
            System.out.printf("O volume da lata de óleo é: %.2f unidades de volume.\n", volume);
        }
    }
}