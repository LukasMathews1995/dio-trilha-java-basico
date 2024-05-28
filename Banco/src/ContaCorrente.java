public class ContaCorrente extends Conta {
    private  static int VARIACAO=0;
    private int contaVariada;


    public ContaCorrente() {
        super(0);
        this.contaVariada = VARIACAO++;
        System.out.printf("Sua conta é %d e sua variação da corrente é %d\n " , getNumero(),getContaVariada());

    }
    public int getContaVariada() {
        return contaVariada;
    }
    public void mostrarDadosContaCorrente(){
        System.out.printf("Conta Corrente : %d-%d\n Agencia : %d\n",getNumero(),getContaVariada(),getAgencia());
    }





}
