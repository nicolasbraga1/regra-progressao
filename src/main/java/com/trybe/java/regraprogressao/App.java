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
    int pesoTotal = 0;
    for (int i = 0; i < quantidadeAtividades; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      atividadeNome[i] = sc.nextLine();
      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      atividadePeso[i] = sc.nextInt();
      sc.nextLine();

      pesoTotal += atividadePeso[i];
    }
    if (pesoTotal != 100) {
      System.out.println("Erro: A soma dos pesos não é igual a 100.");
    }
  }
}