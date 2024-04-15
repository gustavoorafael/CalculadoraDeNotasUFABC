package org.example;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        int[] pesosContainers = {15, 13, 11, 10, 9, 8, 4, 2, 2, 1};
        int capacidadeCaminhao = 25;
        List<List<Integer>> caminhoes = new ArrayList<>();
        for (int peso : pesosContainers) {
            boolean adicionado = false;
            for (int i = 0; i < caminhoes.size(); i++) {
                List<Integer> caminhao = caminhoes.get(i);
                int pesoAtual = 0;
                for (int p : caminhao) {
                    pesoAtual += p;
                }
                if (pesoAtual + peso <= capacidadeCaminhao) {
                    caminhao.add(peso);
                    adicionado = true;
                    break;
                }
            }
            if (!adicionado) {
                List<Integer> novoCaminhao = new ArrayList<>();
                novoCaminhao.add(peso);
                caminhoes.add(novoCaminhao);
            }
        }
        for (int i = 0; i < caminhoes.size(); i++) {
            List<Integer> caminhao = caminhoes.get(i);
            int pesoTotal = 0;
            StringBuilder pesoIndividual = new StringBuilder();
            for (int peso : caminhao) {
                pesoTotal += peso;
                pesoIndividual.append(peso).append(" + ");
            }
            pesoIndividual.setLength(pesoIndividual.length() - 3);
            System.out.println("Caminhão " + (i + 1) + ": " + pesoIndividual + " = " + pesoTotal + " toneladas");
        }
    }
}


