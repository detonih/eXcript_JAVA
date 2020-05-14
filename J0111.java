import java.util.Scanner;

public class J0111 {
  public static void main(String[] args) {
    System.out.println("Digite a tabuada que voce deseja: ");
    Scanner in = new Scanner(System.in);
    int tabuada = in.nextInt();

    // Ax X Bx = Cx
    // Ax -> valor informado pelo usuario
    // -> valor a ser decrementado
    // Cx -> calculo
    for(int i = 10; i >= 1; i--) {
      System.out.println(tabuada + " x " + i + " = " + tabuada * i );
    }
  }
}