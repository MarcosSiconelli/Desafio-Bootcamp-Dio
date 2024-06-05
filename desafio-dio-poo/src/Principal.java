import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Principal {
    public static void main (String[] args) {
        Curso curso1= new Curso();
        curso1.setTitulo("curso Java 1");
        curso1.setDescricao("descrição curso Java 1");
        curso1.setCargaHoraria(8);

        Curso curso2= new Curso();
        curso2.setTitulo("curso Java 2");
        curso2.setDescricao("descrição curso Java 2");
        curso2.setCargaHoraria(6);

        Mentoria mentoria1= new Mentoria();

        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("mentoria java");
        // atrela a data de criação.
        mentoria1.setData(LocalDate.now());
        //poliformismo
        //Conteudo conteudo = new Curso();

       /* System.out.println(curso1);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp= new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descrição Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMarcos= new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos Marcos: "+ devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        devMarcos.progredir();

        System.out.println("---");
        System.out.println("conteudos inscritos Marcos: "+ devMarcos.getConteudosInscritos());
        System.out.println("conteudos concluidos Marcos: "+ devMarcos.getConteudosConcluidos());
        System.out.println("XP" + devMarcos.calcularTotalXp());

        System.out.println("--------------------");


        Dev devJoao= new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos João"+ devJoao.getConteudosInscritos());
        devJoao.progredir();

        System.out.println("---");

        System.out.println("conteudos inscritos João"+ devJoao.getConteudosInscritos());
        System.out.println("conteudos concluidos João: "+ devMarcos.getConteudosConcluidos());
        System.out.println("XP" + devJoao.calcularTotalXp());
        
    }
}
