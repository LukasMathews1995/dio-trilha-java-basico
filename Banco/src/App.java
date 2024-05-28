
public class App {
    public static void main(String[] args) {
ContaPoupanca conta = new ContaPoupanca();
ContaCorrente cc = new ContaCorrente();
/*conta.depositar(2500);
conta.sacar(500);*/

        Cliente cliente= new Cliente("Lucas","1766","66515","07/08/1995");
     /*   cliente.cadastrarConta(conta);
        cliente.mostrarDadosdaConta(conta);
        conta.transferir(500,cc);*/

            conta.imprimirExtrato(cliente);
            conta.mostrarDadosContaPoupanca();
            cc.depositar(5000);


          cliente.mostrarDadosdaConta(cc);

            }
    }
