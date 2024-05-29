import java.util.HashSet;
import java.util.Set;

public class ContaCorrente extends Conta {
    private  static int VARIACAO= 0;
    private int contaVariada;


    public ContaCorrente() {

        this.contaVariada = VARIACAO++;
        System.out.println("Conta criada com sucesso");

    }
    public int getContaVariada() {
        return contaVariada;
    }



    @Override
    public String toString() {
        return String.format("Sua conta é : %d e sua variação da corrente é : %d\n " , getNumero(),getContaVariada());
    }
}
