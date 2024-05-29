
public class App {
    public static void main(String[] args) {
    ContaPoupanca cp = new ContaPoupanca();
    ContaCorrente cc = new ContaCorrente();
    ContaPoupanca po = new ContaPoupanca();
    ContaCorrente cc2 = new ContaCorrente();


        Cliente cliente= new Cliente("Lucas","1766","66515","07/08/1995",cp);
        Cliente cliente2 = new Cliente("Mariana","1883","645545","08/02/2003",cc);
       cliente.adicionarConta(po);
       cliente2.adicionarConta(cc2);
        System.out.println(cc);
        System.out.println(cc2);






            }
    }
