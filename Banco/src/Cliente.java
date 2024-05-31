
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class Cliente {
private String nome;
private String cpf;
private String telefone;
private LocalDate dataDeNascimento;
private Set<Conta> conta= new HashSet<>();





public Cliente(String nome, String cpf, String telefone, String dataDeNascimento) {
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    this.dataDeNascimento = LocalDate.parse(dataDeNascimento, formatter);


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
    public Set<Conta> getConta() {
    return conta;
    }


    public void cadastrarConta(Conta c) {
        if(c.getClass().equals(ContaCorrente.class)){
            conta.add(c);

        }
        else if(c.getClass().equals(ContaPoupanca.class)){
            conta.add(c);

        }else{
            conta.add(c);

        }

    }

    public void mostrarDadosdaConta(Conta c) {

    if(c.getClass().equals(ContaCorrente.class)) {
        for (int i = 0; i < conta.size(); i++) {


            System.out.printf("Nome : %s numero de telefone : %s e data de nascimento : %s Banco: %s \n ", getNome(), getTelefone(), getDataDeNascimento());

        }

    } else if ((c.getClass().equals(ContaPoupanca.class)))
        for (int i = 0; i < conta.size(); i++) {


        System.out.printf("Nome : %s numero de telefone : %s e data de nascimento : %s Banco: %s \n ", getNome(), getTelefone(), getDataDeNascimento());

    }

    else
        for (int i = 0; i < conta.size(); i++) {


            System.out.printf("Nome : %s numero de telefone : %s e data de nascimento : %s  \n ", getNome(), getTelefone(), getDataDeNascimento());

        }



    }
}


