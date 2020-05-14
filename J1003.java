import java.util.Scanner;

public class J1003 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Informe o inciio do intervalo: ");
    int ini = in.nextInt();
    System.out.println("Informe o inciio do intervalo: ");
    int fim = in.nextInt();

    int i = ini;
    int soma = ini;

    while(i < fim) {
      i++;
      soma += i;
    }

    System.out.println(soma);

  }
}