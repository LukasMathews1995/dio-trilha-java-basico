import java.util.HashSet;
import java.util.Set;

public class ContaPoupanca extends Conta {
    private static int VARIACAO = 10;
    private int contaVariada;

    public ContaPoupanca() {

        this.contaVariada = VARIACAO++;
        System.out.println("Conta criada com sucesso");

    }

    public int getContaVariada() {
        return contaVariada;
    }

    @Override
    public String toString() {
        return String.format("Sua conta  é : %d e sua variação da corrente é :  %d\n " , getNumero(),getContaVariada());
    }
}