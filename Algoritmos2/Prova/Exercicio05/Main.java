//5.Crie um programa que permita ao usuário informar a quantidade de alunos que deseja cadastrar e em seguida, utilizando vetores, efetuar o cadastramento do nome do aluno e sua nota na prova AC1(também utilizando vetores).
//a. Exemplo o usuário informa que deseja cadastrar dois alunos e digita seus nomes e notas em seguida é exibida a mensagem:
//i. Nome = JUCA. Nota AC1 = 8.0.
//ii. Nome = MARCOS. Nota AC1 = 10.0

import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    int qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos que deseja cadastrar: "));
    String nomeAluno[] = new String[qtdAlunos];
    float notas[] = new float[qtdAlunos];
    for (int i = 0; i < qtdAlunos; i++) {
      nomeAluno[i] = JOptionPane.showInputDialog("Digite o nome do aluno:");
      notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do aluno:"));
      System.out.println((i+1) + ". Nome = " + nomeAluno[i] + ". Nota AC1 = " + notas[i] + ". ");
    }
  }
}