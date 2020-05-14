import java.util.Scanner;

public class J0101 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual sua idade?");
    int minhaIdade = scanner.nextInt();
    System.out.println("Qual a idade da sua mãe?");
    int idadeMae = scanner.nextInt();
    int diferencaIdade = idadeMae - minhaIdade;
    System.out.print("A diferenca de idade entre eu e minha mae é: " + diferencaIdade);

  }
}