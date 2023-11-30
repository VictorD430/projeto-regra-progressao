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
    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    int quant = 0;
    quant = Integer.parseInt(scanner.nextLine());
    String nome;
    int peso = 0;

    for (int i = 1; i < quant; i += 1) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      nome = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      peso = Integer.parseInt(scanner.nextLine());
    }
  }
}