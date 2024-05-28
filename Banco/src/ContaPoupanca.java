public class ContaPoupanca extends Conta {
    private static int VARIACAO=10;
    private int contaVariada;

    public ContaPoupanca() {
        super(0);
        this.contaVariada = VARIACAO++;
        System.out.printf("Sua conta é %d e sua variação da poupança é %d\n " , getNumero(),getContaVariada());

    }
    public int getContaVariada() {
        return contaVariada;
    }
    public void mostrarDadosContaPoupanca(){
        System.out.printf("Conta Poupança : %d-%d\n Agencia : %d\n",getNumero(),getContaVariada(),getAgencia());
    }



}
