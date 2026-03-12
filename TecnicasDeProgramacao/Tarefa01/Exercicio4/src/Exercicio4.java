/*
Faça um programa que leia uma temperatura em graus Centígrados e
apresente-a convertida em graus Fahrenheit. A fórmula de conversão é:
F = (9 * C + 160) / 5, onde F é a temperatura em Fahrenheit e C em graus
Centígrados. 
*/
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.print("Digite a temperatura em Graus Celsius (C): ");
            double c = leitor.nextDouble();
            
            // Aplicando a fórmula do enunciado
            double f = (9 * c + 160) / 5;
            
            System.out.printf("%.1f°C equivalem a %.1f°F\n", c, f);
        }
    }
}