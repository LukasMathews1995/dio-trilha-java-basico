public class ContaCorrente extends Conta {
    private static int VARIACAO=0;
    private int contaVariada;


    public ContaCorrente() {
        super(0);
        this.contaVariada = VARIACAO++;

    }
    public int getContaVariada() {
        return contaVariada;
    }
    public void mostrarDadosContaCorrente(){
        System.out.printf("Conta Corrente : %d-%d\n Agencia : %d\n",getNumero(),getContaVariada(),getAgencia());
    }





}
