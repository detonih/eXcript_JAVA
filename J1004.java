import java.util.Scanner;

public class J1004 {
  public static void main(String[] args) {
    
    System.out.println("Digite um numero");
    int numero = new Scanner(System.in).nextInt();
    int soma = 0;

    /* 
    123 -> dividimos por 10, resultado é 12 e sobra 3
    (123 / 10) = 12 .> (123 % 10) = 3
    (12 / 10) = 1 .> (12 % 10) = 2
    (1 / 10) = 0 .> (1 % 10) = 1

    Para somarmos todos os numeros basta extrarir o modulo 
    do numero e incrementar esse numero a variavel soma

    1) obter o modulo do numero digitado
    2) incrementar o modulo a nossa variavel soma
    3) dividir o numero por 10 e atribuirmos a variavel numero
    */

    while(numero > 0 ) {
      int modulo = numero % 10;
      soma += modulo;
      numero /= 10; // num = num / 10
      System.out.println("o valor de soma é: " + soma);
    }

    System.out.println("a soma dos algarismos é: " + soma);
  }

}