//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso = new Curso("js","js comeco",4);
        Curso curso2 = new Curso("java", "java comeco",6);
        Curso curso3 = new Curso("python","python comeco",5);




        Mentoria mentoria = new Mentoria("c++","c++ comeco");




        Bootcamp bootcamp = new Bootcamp("Bootcamp Java","Descricao Bootcamp Java");

        bootcamp.adicionarCursos(curso);
        bootcamp.adicionarCursos(curso2);
        bootcamp.adicionarCursos(mentoria);
        bootcamp.adicionarCursos(curso3);
        Dev devLucas = new Dev("Lucas");

        devLucas.inscreverBootCamp(bootcamp);
        System.out.println(devLucas);
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("-");
        System.out.println(devLucas);


        System.out.println("------");

        Dev devJoao = new Dev("Joao");

        devJoao.inscreverBootCamp(bootcamp);
        System.out.println(devJoao);
        devJoao.progredir();
        System.out.println("_");

        System.out.println(devJoao);

    }
}
