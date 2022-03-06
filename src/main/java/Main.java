import one.digitalinnovation.desafio.dominio.Bootcamp;
import one.digitalinnovation.desafio.dominio.Curso;
import one.digitalinnovation.desafio.dominio.Dev;
import one.digitalinnovation.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("curso angular");
        curso3.setDescricao("descrição curso angular");
        curso3.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria de js");
        mentoria2.setDescricao("descrição mentoria js");
        mentoria2.setData(LocalDate.now());

        Mentoria mentoria3 = new Mentoria();
        mentoria3.setTitulo("mentoria de angular");
        mentoria3.setDescricao("descrição mentoria angular");
        mentoria3.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);
        Bootcamp bootcamp1 =new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Bootcamp bootcamp2 =new Bootcamp();
        bootcamp2.setNome("Bootcamp Full-Stack Developer");
        bootcamp2.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp2.getConteudos().add(curso1);
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(curso3);
        bootcamp2.getConteudos().add(mentoria1);
        bootcamp2.getConteudos().add(mentoria2);
        bootcamp2.getConteudos().add(mentoria3);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp1);
        System.out.println("Dev: " + devCamila.getNome());
        System.out.println("Bootcamp: " + bootcamp1.getNome());
        System.out.println("Conteúdos inscritos" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularXp());


        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp1);
        System.out.println("Dev: " + devJoao.getNome());
        System.out.println("Bootcamp: " + bootcamp1.getNome());
        System.out.println("Conteúdos inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularXp());

        System.out.println("-------");

        Dev devManuela = new Dev();
        devManuela.setNome("Manuela");
        devManuela.inscreverBootcamp(bootcamp2);
        System.out.println("Dev: " + devManuela.getNome());
        System.out.println("Bootcamp: " + bootcamp2.getNome());
        System.out.println("Conteúdos inscritos" + devManuela.getConteudosInscritos());
        devManuela.progredir();
        devManuela.progredir();
        devManuela.progredir();
        devManuela.progredir();
        devManuela.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos" + devManuela.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + devManuela.getConteudosConcluidos());
        System.out.println("XP: " + devManuela.calcularXp());



    }
}
