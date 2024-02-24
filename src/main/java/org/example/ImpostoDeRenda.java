package org.example;


import java.util.Scanner;

public class ImpostoDeRenda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o sálario bruto: ");
        double salarioBruto = scanner.nextDouble();

        System.out.println("Digite o número de dependentes: ");
        int numeroDependentes = scanner.nextInt();

        double aliquota = 0;
        double parcelaDeduzir = 0;
        double deducaoPorDependente = 187.80;
        double calculoImpostoDeRenda;

        if(salarioBruto <= 1868.22){
            parcelaDeduzir = 0;
        } else if (salarioBruto > 1868.22 && salarioBruto <= 2799.86) {
            aliquota = 0.075;
            parcelaDeduzir = 140.12;
        } else if (salarioBruto > 2799.86 && salarioBruto <= 3733.19){
            aliquota = 0.15;
            parcelaDeduzir = 350.11;
        } else if (salarioBruto > 3733.19 && salarioBruto <= 4664.68) {
            aliquota = 0.225;
            parcelaDeduzir = 630.10;
        } else if (salarioBruto > 4664.68) {
            aliquota = 0.275;
            parcelaDeduzir = 863.33;
        }

        calculoImpostoDeRenda = (((salarioBruto - (deducaoPorDependente * numeroDependentes)) * aliquota) - parcelaDeduzir);
        System.out.println("O valor da contribuição é: " + calculoImpostoDeRenda);
        scanner.close();
    }
}