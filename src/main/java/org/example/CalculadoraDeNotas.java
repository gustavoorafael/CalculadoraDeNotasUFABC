package org.example;


import java.util.Scanner;

public class CalculadoraDeNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtenha as notas dos testes
        double[] testes = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota do teste " + (i + 1) + ": ");
            testes[i] = scanner.nextDouble();
        }

        // Obtenha as notas das provas
        System.out.print("Digite a nota da Prova 1: ");
        double prova1 = scanner.nextDouble();
        System.out.print("Digite a nota da Prova 2: ");
        double prova2 = scanner.nextDouble();

        // Calcule a média
        double media = (0.8 * ((prova1 + prova2) / 2.0)) + (0.2 * calcularMedia(testes));

        // Determine o conceito
        String conceito = calcularConceito(media);

        // Exiba o resultado
        System.out.println("A média é: " + media);
        System.out.println("Conceito: " + conceito);

        scanner.close();
    }

    // Função para calcular a média dos testes
    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    // Função para converter a média em conceito
    public static String calcularConceito(double media) {
        if (media >= 8.5) {
            return "A";
        } else if (media >= 7.0) {
            return "B";
        } else if (media >= 5.5) {
            return "C";
        } else if (media >= 4.0) {
            return "D";
        } else {
            return "F";
        }
    }
}
