
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
     //TODO: conhecer e importar a classe scanner
     //exibir as mensagens para nosso usuario
     //obter pela scanner os valores digitados no terminal
     //exibir mensagem da conta criada
     
     Scanner sc = new Scanner(System.in).useLocale(Locale.US);

     System.out.println("Digite o seu nome");
     String nome = sc.next();

     System.out.println("digite o número da agência");
     String agencia = sc.next();

     System.out.println("Digite o número de sua conta");
     int numero = sc.nextInt();

     System.out.println("Digite o seu saldo");
     double saldo = sc.nextDouble();

     System.out.println("Olá "+ nome + " obrigado por criar a sua conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque");

    }
}
