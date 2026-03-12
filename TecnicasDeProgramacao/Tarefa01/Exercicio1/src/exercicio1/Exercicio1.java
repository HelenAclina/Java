
package exercicio1;
import java.util.Scanner;

public class Exercicio1 {
/* Em época de pouco dinheiro, os comerciantes estão procurando aumentar suas
vendas oferecendo desconto. Faça um programa que possa entrar com o nome
de um produto e seu valor unitário e calcular e exibir um novo valor com um
desconto de 9%
*/

    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.print("Digite o nome do produto: ");
            String nome = leitor.nextLine();
            
            System.out.print("Digite o valor unitário: ");
            double valorOriginal = leitor.nextDouble();
            
            // Cálculo: valor - (valor * 0.09)
            double novoValor = valorOriginal * 0.91;
            
            System.out.printf("Produto: %s\n", nome);
            System.out.printf("Novo valor com 9%% de desconto: R$ %.2f\n", novoValor);
        }
    }
}