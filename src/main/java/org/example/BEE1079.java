package org.example;


import java.util.Scanner;

/**
 *Read an integer N, which represents the number of following test cases. Each test case consists of three floating-point numbers,
 * each one with one digit after the decimal point. Print the weighted average for each of these sets of three numbers,
 * considering that the first number has weight 2, the second number has weight 3 and the third number has weight 5.
 *
 * Input
 * The input file contains an integer number N in the first line. Each N following line is a test case with three float-point
 * numbers, each one with one digit after the decimal point.
 *
 * Output
 * For each test case, print the weighted average according with below example.
 *
 * Input Sample
 * 3
 * 6.5 4.3 6.2
 * 5.1 4.2 8.1
 * 8.0 9.0 10.0
 *
 * Output Sample
 * 5.7
 * 6.3
 * 9.3
 *
 */
public class BEE1079 {
    public static double calcularMediaPonderada(double num1, double num2, double num3) {
        return (num1 * 2 + num2 * 3 + num3 * 5) / 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número de casos de teste
        int numCasosTeste = scanner.nextInt();

        // Processa cada caso de teste
        for (int i = 0; i < numCasosTeste; i++) {
            // Lê três double como entrada
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double num3 = scanner.nextDouble();

            // Calcula e imprime a média ponderada 
            double resultado = calcularMediaPonderada(num1, num2, num3);
            System.out.printf("%.1f%n", resultado);
        }
        scanner.close();
    }
}