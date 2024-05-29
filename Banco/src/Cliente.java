import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Cliente {
private String nome;
private String cpf;
private String telefone;
private final LocalDate dataDeNascimento;
private Set<Conta> conta= new LinkedHashSet<>();




public Cliente(String nome, String cpf, String telefone, String dataDeNascimento,Conta conta) {
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    this.dataDeNascimento = LocalDate.parse(dataDeNascimento, formatter);
    this.cadastrarConta(conta);


}

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataDeNascimento() {
    String dataNascimento = dataDeNascimento.toString();
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     return LocalDate.parse(dataNascimento).format(formatter);
    }



    private void cadastrarConta(Conta c) {
        if(c.getClass().equals(ContaCorrente.class)){

            conta.add(c);
        }
        else if(c.getClass().equals(ContaPoupanca.class)){

            conta.add(c);
        }else{

            conta.add(c);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(getNome(), cliente.getNome()) && Objects.equals(getCpf(), cliente.getCpf()) && Objects.equals(getTelefone(), cliente.getTelefone()) && Objects.equals(getDataDeNascimento(), cliente.getDataDeNascimento()) && Objects.equals(conta, cliente.conta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCpf(), getTelefone(), getDataDeNascimento(), conta);
    }

    public void mostrarDadosdoCliente(Conta c) {

    if(c.getClass().equals(ContaCorrente.class)) {
            System.out.printf("Nome : %s, Numero de telefone : %s ,data de nascimento : %s  e tipo de Conta : Corrente \n ", getNome(), getTelefone(), getDataDeNascimento());

        }else if(c.getClass().equals(ContaPoupanca.class)){
        System.out.printf("Nome : %s , Numero de telefone : %s , data de nascimento : %s e tipo de Conta : Poupança \n ", getNome(), getTelefone(), getDataDeNascimento());

    }else {
        System.out.printf("Nome : %s ,Numero de telefone : %s , data de nascimento : %s \n ", getNome(), getTelefone(), getDataDeNascimento());
    }



    }
}
