//Crie um programa que permita ao usuário informar a quantidade de clientes que deseja cadastrar e em seguida, utilizando vetores, efetuar o cadastramento do nome do cliente e o valor total da sua compra (também utilizando vetores).
//a. Exemplo o usuário informa que deseja cadastrar três clientes e digita seus nomes e o valor total de suas compras em seguida é exibida a mensagem:
//i. Nome = JOÃO. Total de compras = 138.55.
//ii. Nome = MARCELA.Total de compras = 38.55.
//iii. Nome = MARIA. Total de compras = 77.55.

import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    int qtdClientes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de clientes: "));
    String nomeCliente[] = new String[qtdClientes];
    float valorTotal[] = new float[qtdClientes];
    for (int i = 0; i < qtdClientes; i++) {
      nomeCliente[i] = JOptionPane.showInputDialog("Digite o nome do cliente:");
      valorTotal[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor total da compra:"));
      System.out.println((i+1) + ". Nome = " + nomeCliente[i] + ". Total de compras = " + valorTotal[i] + ". ");
    }
  }
}