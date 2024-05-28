import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.List;

public class Cliente {
private String nome;
private String cpf;
private String telefone;
private LocalDate dataDeNascimento;
private List<Conta> conta;




public Cliente(String nome, String cpf, String telefone, String dataDeNascimento) {
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    this.dataDeNascimento = LocalDate.parse(dataDeNascimento, formatter);
    conta = new ArrayList<Conta>();

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
    public List<Conta> getConta() {
    return conta;
    }


    public void cadastrarConta(Conta c) {
        if(c.getClass().equals(ContaCorrente.class)){
            c= new ContaCorrente();
            conta.add(c);
        }
        else if(c.getClass().equals(ContaPoupanca.class)){
            c = new ContaPoupanca();
            conta.add(c);
        }else{

            conta.add(c);
        }

    }

    public void mostrarDadosdoCliente(Conta c) {

    if(c.getClass().equals(ContaCorrente.class)) {
        for (int i = 0; i <= conta.size(); i++) {


            System.out.printf("Nome : %s numero de telefone : %s e data de nascimento : %s variacao: %d \n ", getNome(), getTelefone(), getDataDeNascimento(),((ContaCorrente) c).getContaVariada());

        }

    } else if ((c.getClass().equals(ContaPoupanca.class)))
        for (int i = 0; i <= conta.size(); i++) {


        System.out.printf("Nome : %s numero de telefone : %s e data de nascimento : %s variacao: %d \n ", getNome(), getTelefone(), getDataDeNascimento(),((ContaPoupanca) c).getContaVariada());

    }

    else
        for (int i = 0; i <= conta.size(); i++) {


            System.out.printf("Nome : %s numero de telefone : %s e data de nascimento : %s  \n ", getNome(), getTelefone(), getDataDeNascimento());

        }



    }
}
