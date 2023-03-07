//Crie um programa que permita, através de um método, verificar e informar ao usuário o resultado de uma base elevado a uma potência, valores por ele digitado(através de caixas de diálogo). Sabendo que a potência de um número é igual a multiplicação de sua base pela quantidade de vezes indicada em seu expoente (2^3 = 2*2*2➔ 8). Não use a classe Math>
//a. Ex: Usuário digita como base o número 2 e como expoente o número 3.
//b. Recebe a mensagem: 2 elevado a potência 3 = 8.

import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    int numeroBase = Integer.parseInt(JOptionPane.showInputDialog("Digite um número na base: "));
    int numeroExpoente = Integer.parseInt(JOptionPane.showInputDialog("Digite um número expoente: "));
    int novoNumero = numeroBase;
    for(int i = 1; i < numeroExpoente; i++) {
      novoNumero = numeroBase * novoNumero;
    }
    System.out.print(numeroBase + " elevado a potência " + numeroExpoente + " = " + novoNumero + ".");
  }
}