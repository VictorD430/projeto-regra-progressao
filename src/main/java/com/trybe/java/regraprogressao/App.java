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
    float total = 0;
    float soma = 0;

    for (int i = 0; i < quant; i += 1) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      nome = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      peso = Integer.parseInt(scanner.nextLine());
      System.out.println("Digite a nota obtida para " + nome + ":");
      nota = Integer.parseInt(scanner.nextLine());
      total += peso * nota;
      soma += peso;
    }

    float resultado = total / 100.0f;

    if (soma != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }
    if (resultado >= 85.0) {
      System.out.println("Parabéns! Você alcançou "
          + resultado + "%! E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, "
              + resultado
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
    scanner.close();
  }
}