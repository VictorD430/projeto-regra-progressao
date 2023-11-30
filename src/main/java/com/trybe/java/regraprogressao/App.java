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
    Scanner scanner = new Scanner(System.in);
    int quant = 0;
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    quant = Integer.parseInt(scanner.nextLine());
    String nome;
    int peso = 0;
    int nota = 0;
    float soma = 0;

    for (int i = 0; i < quant; i += 1) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      nome = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      peso = Integer.parseInt(scanner.nextLine());
      System.out.println("Digite a nota obtida para " + nome + ":");
      nota = Integer.parseInt(scanner.nextLine());
      soma += peso;
    }

    if (soma != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }
    scanner.close();
  }
}