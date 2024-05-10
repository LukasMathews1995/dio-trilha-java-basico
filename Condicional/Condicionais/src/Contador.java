
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args)  {
        Scanner sc = new Scanner (System.in).useLocale(Locale.US);
        System.out.println("Insira o primeiro parâmetro : ");
        int parametroUm= sc.nextInt();
        System.out.println("Insira o segundo parâmetro : ");
        int parametroDois = sc.nextInt();
        try {
         
          contar(parametroUm,parametroDois);
        
        }
        
        catch(ParametroInvalidoException exception){
          System.err.println("O segundo parâmetro deve ser maior que o primeiro parâmetro");
        }


}
static void contar(int parametroUm,int parametroDois) throws ParametroInvalidoException{
  if(parametroUm>parametroDois){
  throw new ParametroInvalidoException();
  }
  int contagem = parametroDois - parametroUm;
  for(int i = 0 ; i<= contagem; i++){
    System.out.println(i);
  }

}
}

