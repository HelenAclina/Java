/*
Faça um programa que leia dois valores e informe a média entre eles. (use float
como tipo de dado).
*/

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.print("Digite o primeiro valor: ");
            float n1 = leitor.nextFloat();
            
            System.out.print("Digite o segundo valor: ");
            float n2 = leitor.nextFloat();
            
            float media = (n1 + n2) / 2;
            
            System.out.println("A média entre os valores é: " + media);
        }
    }
}