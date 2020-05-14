import java.util.Scanner;

public class J0011 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // pedir dados e armazenar em variaveis
    System.out.println("Digite o seu nome");
    String nome = in.nextLine();

    System.out.println("Digite a sua idade");
    int idade = in.nextInt();

    System.out.println("Digite a sua cidade");
    String cidade = in.next();

    System.out.print("Ola. Meu nome é " + nome + " tenho " + idade + " anos " + "e sou de " + cidade);

  }
}