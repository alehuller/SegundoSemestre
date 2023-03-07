//Crie um programa que permita ao usuário informar a quantidade de jogadores que deseja cadastrar e em seguida, utilizando vetores, efetuar o cadastramento do nome do jogador e a sua idade (também utilizando vetores).
//a. Exemplo o usuário informa que deseja cadastrar três jogadores e digita seus nomes e idade e em seguida é exibida a mensagem:
//i. Nome = ROGÉRIO. Idade = 33.
//ii. Nome = RONALDO.Idade = 32.
//iii. Nome = ROBINHO. Idade = 25.

import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    int qtdJogadores = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de jogadores: "));
    String nomeJogador[] = new String[qtdJogadores];
    int idade[] = new int[qtdJogadores];
    for (int i = 0; i < qtdJogadores; i++) {
      nomeJogador[i] = JOptionPane.showInputDialog("Digite o nome do jogador:");
      idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do jogador:"));
      System.out.println((i+1) + ". Nome = " + nomeJogador[i] + ". Idade = " + idade[i] + ". ");
    }
  }
}