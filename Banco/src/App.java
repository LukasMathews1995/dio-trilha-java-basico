
public class App {
    public static void main(String[] args) {
    ContaPoupanca cp = new ContaPoupanca();
    ContaCorrente cc = new ContaCorrente();


        Cliente cliente= new Cliente("Lucas","1766","66515","07/08/1995",cc);
        Cliente cliente2 = new Cliente("Mariana","1883","645545","08/02/2003",cp);

    cliente.mostrarDadosdoCliente(cp);
    cliente2.mostrarDadosdoCliente(cc);
    cc.mostrarDadosContaCorrente();
            }
    }
