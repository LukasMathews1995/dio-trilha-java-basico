import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner (System.in).useLocale(Locale.US);
    System.out.println("Por favor, digite seu número da agência :");
    int numero = sc.nextInt();
    System.out.println("Digite sua agência:");
    String agencia = sc.next();
    System.out.println("Digite seu nome : ");
    String nome= sc.next();
    System.out.println("Digite seu saldo : ");
    double saldo  = sc.nextDouble();
            
        
System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f, já está disponível para saque.",nome,agencia,numero,saldo);
        
            }
            
}
        
    
    

