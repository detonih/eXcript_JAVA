import java.util.Scanner;

public class J01012 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    System.out.println("Digite o seu login");
    String login = scanner.nextLine();

    System.out.println("Digite sua senha");
    String senha = scanner.next();

    // Não se pode compar uma instancia de string (login) com uma string ("henrique")
    // utilizando-se "==", para isso usamos equals()
    // se a var fosse do tipo inteiro utilizarioamos a comparação "=="
    if(login.equals("henrique") && senha.equals("1234")) {
      System.out.println("Logado com sucesso");
    } else {
      System.out.println("Login ou senha inválidos");
    }
  }
}