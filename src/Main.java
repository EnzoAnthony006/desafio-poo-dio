import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Do curso De Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso HTML");
        curso2.setDescricao("Descrição Do curso De HTML");
        curso2.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição Da Mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEnzo = new Dev();
        devEnzo.setNome("Enzo Anthony");
        devEnzo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Enzo:" + devEnzo.getConteudosInscritos());
        devEnzo.progredir();
        devEnzo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Enzo:" + devEnzo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Enzo:" + devEnzo.getConteudosConcluidos());
        System.out.println("XP:" + devEnzo.calcularTotalXp());

        System.out.println("--------------------------");

        Dev devJulia = new Dev();
        devJulia.setNome("Julia Oliveira");
        devJulia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Julia:" + devJulia.getConteudosInscritos());
        devJulia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Julia:" + devJulia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Julia:" + devJulia.getConteudosConcluidos());
        System.out.println("XP:" + devJulia.calcularTotalXp());
    }
}
