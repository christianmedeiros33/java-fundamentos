package com.javaFundamentos.javacore.association.exercise.test;

import com.javaFundamentos.javacore.association.exercise.model.Aluno;
import com.javaFundamentos.javacore.association.exercise.model.Local;
import com.javaFundamentos.javacore.association.exercise.model.Professor;
import com.javaFundamentos.javacore.association.exercise.model.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Professor professor = new Professor("pedro", "tecnologia");
        Aluno aluno = new Aluno("christian", 22);
        Aluno aluno2 = new Aluno("marcos", 12);
        Local local = new Local("brazil");
        Seminario seminario = new Seminario("programa brazil", local);
        Seminario seminario2 = new Seminario("programa japao", local);
        Aluno[] alunos = {aluno, aluno2};
        Seminario[] seminarios = {seminario, seminario2};

        professor.setSeminarios(seminarios);
        seminario.setLocal(local);
        System.out.println(seminario.getLocal());
        seminario.setAlunos(alunos);
        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario2);

        System.out.println("==========");

        aluno.imprimir();

        System.out.println("==========");

        aluno2.imprimir();

        System.out.println("==========");

        professor.imprimir();

        System.out.println("==========");

        seminario.imprimir();
    }
}
