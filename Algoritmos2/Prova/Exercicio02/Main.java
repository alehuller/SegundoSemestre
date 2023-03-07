//Crie um programa que permita, através de um método, verificar e informar ao usuário o fatorial de um número por ele digitado(através de caixas de diálogo). Sabendo que o fatorial de um número é igual a multiplicação de todos os inteiros de 1 até este número (3! = 3*2*1➔ 6).
//a. Ex: Usuário digita o número 3.
//b. Recebe a mensagem: O fatorial de 3 é = 6.

import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
    int mostrarNumero = numero;
    int fatorial = numero;
    while (numero > 1) {
      fatorial = fatorial * (numero - 1); 
      numero = numero - 1;
    }
    System.out.print("O fatorial de " + mostrarNumero + " é = " + fatorial + ".");
  }
}