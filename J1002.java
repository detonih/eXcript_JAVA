public class J1002 {
  public static void main(String[] args) {
    System.out.print("A soma dos 100 primeiros numeros é: ");

    int soma = 0;

    for(int i = 1; i <= 100; i++) {
      soma += i;
    }
    System.out.print(soma);
  }
}