
/*
a vários tributos, a base de cálculo é o salário mínimo. Fazer um programa
que leia o valor do salário mínimo e o valor do salário de uma pessoa. Calcular
e mostrar quantos salários mínimos ela ganha
*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        try (java.util.Scanner leitor = new Scanner(System.in)) {
            System.out.print("Digite o valor do salário mínimo atual: ");
            double salarioMinimo = leitor.nextDouble();
            
            System.out.print("Digite o valor do seu salário: ");
            double salarioPessoa = leitor.nextDouble();
            
            double quantidadeSalarios = salarioPessoa / salarioMinimo;
            
            System.out.printf("Você ganha o equivalente a %.2f salários mínimos.\n", quantidadeSalarios);
        }
    }
}