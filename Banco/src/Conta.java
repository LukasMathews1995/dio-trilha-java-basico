public abstract class Conta implements IConta {
    protected static int NUMERO_CONTA=5000;
    protected static int AGENCIA = 281;
    protected int numero;
    protected int agencia;
    protected double saldo;



    public Conta( double saldo ) {
        this.numero = NUMERO_CONTA++;
        this.agencia = AGENCIA;
        this.saldo = saldo;





    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
            this.saldo = saldo;
    }
    public int getNumero() {
            return numero;
    }
    public int getAgencia() {
        return agencia;
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void sacar(double valor) {
   saldo = saldo - valor;
    }


    public   void transferir(double valor,Conta c){
        this.sacar(valor);
        c.depositar(valor);
    }


    public void imprimirExtrato(Cliente cliente) {

        System.out.println("Bem vindo : " + cliente.getNome());
        System.out.printf("Seu saldo é : %.2f\n",getSaldo());

    }
}




