package com.trybe.java.regraprogressao;

import java.util.Scanner;
/**
 * App.
 */

public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int quantidadeAtividades = sc.nextInt();
    sc.nextLine();

    String[] atividadeNome = new String[quantidadeAtividades];
    int[] atividadePeso = new int[quantidadeAtividades];
    int[] notas = new int[quantidadeAtividades];
    int pesoTotal = 0;
    for (int i = 0; i < quantidadeAtividades; i++) {
      System.out.printf("Digite o nome da atividade %d:\n", i + 1);
      atividadeNome[i] = sc.nextLine();
      System.out.printf("Digite o peso da atividade %d:\n", i + 1);
      atividadePeso[i] = sc.nextInt();
      while (atividadePeso[i] < 1 || atividadePeso[i] > 100) {
        System.out.println("Erro: Peso inválido! O peso deve ser entre 1 e 100.");
        System.out.printf("Digite novamente o peso da atividade %d:\n", i + 1);
        atividadePeso[i] = sc.nextInt();
      }
      sc.nextLine();

      pesoTotal += atividadePeso[i];

      System.out.printf("Digite a nota obtida para %s:\n", atividadeNome[i]);
      notas[i] = sc.nextInt();
      while (notas[i] < 0 || notas[i] > 100) {
        System.out.println("Erro: Nota inválida! A nota deve ser entre 0 e 100.");
        System.out.printf("Digite novamente a nota obtida para %s:\n", atividadeNome[i]);
        notas[i] = sc.nextInt();
      }
      sc.nextLine();
    }
    if (pesoTotal != 100) {
      System.out.println("Erro: A soma dos pesos não é igual a 100.");
    }
    double media = 0;
    for (int i = 0; i < quantidadeAtividades; i++) {
      media += ((double) notas[i] * atividadePeso[i]) / 100;
    }

    if (media >= 85) {
      System.out.println("Parabéns! Você alcançou " + media
          + "%! E temos o prazer de informar que você obteve aprovação!");
    } else if (media < 85) {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, " + media
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }
}