package equipamentos.smartPhone;

import equipamentos.telefone.AparelhoTelefonico;
import equipamentos.navegador.NavegadorInternet;
import equipamentos.reprodutormusica.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar() {
        System.out.println("ligando");

    }

    @Override
    public void atender() {
System.out.println("atendeu");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciarCorreioVoz");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a pagina");
    }

    @Override
    public void adicionarAba() {
        System.out.println("adicionando a aba");

    }

    @Override
    public void tocar() {
        System.out.println("tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("pausou a musica");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("musica selecionada");
}
}
