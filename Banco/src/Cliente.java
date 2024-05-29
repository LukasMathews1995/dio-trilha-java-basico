import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Cliente {
private String nome;
private String cpf;
private String telefone;
private final LocalDate dataDeNascimento;
private Set<ContaPoupanca> contaPoupanca = new LinkedHashSet<>();
    private Set<ContaCorrente> contaCorrente = new LinkedHashSet<>();


    public Cliente(String nome, String cpf, String telefone, String dataDeNascimento,ContaPoupanca contaPoupanca) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataDeNascimento = LocalDate.parse(dataDeNascimento, formatter);
        this.getContaPoupanca().add(contaPoupanca);


    }

public Cliente(String nome, String cpf, String telefone, String dataDeNascimento,ContaCorrente contaCorrente) {
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    this.dataDeNascimento = LocalDate.parse(dataDeNascimento, formatter);
    this.getContaCorrente().add(contaCorrente);


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
    public Set<ContaPoupanca> getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(Set<ContaPoupanca> contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }

    public Set<ContaCorrente> getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(Set<ContaCorrente> contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public String getDataDeNascimento() {
    String dataNascimento = dataDeNascimento.toString();
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     return LocalDate.parse(dataNascimento).format(formatter);
    }
    public void adicionarConta(Conta conta1) {
        if(conta1.getClass().equals(ContaCorrente.class)){
            this.getContaCorrente().add((ContaCorrente) conta1);}
        else if(conta1.getClass().equals(ContaPoupanca.class)){

            this.getContaPoupanca().add((ContaPoupanca) conta1);
        }
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
    public void removerConta(Conta conta1){
        if(conta1.getClass().equals(ContaCorrente.class)){
        this.getContaCorrente().remove(conta1);}
        else if(conta1.getClass().equals(ContaPoupanca.class)){
            this.getContaPoupanca().remove(conta1);
        }
    }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cliente cliente = (Cliente) o;
            return Objects.equals(getNome(), cliente.getNome()) && Objects.equals(getCpf(), cliente.getCpf()) && Objects.equals(getTelefone(), cliente.getTelefone()) && Objects.equals(getDataDeNascimento(), cliente.getDataDeNascimento()) && Objects.equals(contaPoupanca, cliente.contaPoupanca);
        }

        @Override
        public int hashCode() {
            return Objects.hash(getNome(), getCpf(), getTelefone(), getDataDeNascimento(), contaPoupanca);
        }


    }



