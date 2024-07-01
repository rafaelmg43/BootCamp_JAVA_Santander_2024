package src.edu.Modulo3.ProgramacaoOriaentadaObjetos.EDesafioDeProjeto.AbstraindoumBootcampUsandoOrientaçãoObjetosJava.README.Br.Com.Dio.Desafio.Dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricacao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descricacao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descicao Mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer ");
        bootCamp.setDescricao("Descricao BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootCamp);

        System.out.println("Conteudos Inscritos Rafael " + devRafael.getConteudosInscritos());
        devRafael.progredir();
        devRafael.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Rafael " + devRafael.getConteudosInscritos());
        System.out.println("Conteudos COncluidos Rafael" + devRafael.getConteudosConcluidos());
        System.out.println("Xp" + devRafael.calcularTotalXp());

        System.out.println("---------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootCamp);
        System.out.println("Conteudos Inscritos Joao " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joao " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao " + devJoao.getConteudosConcluidos());
        System.out.println("Xp" + devJoao.calcularTotalXp());

    }
}
