package br.senai.sp.jandira;

import java.util.Scanner;

public class CriarTarefa {

    // Instancia da Tarefa
    Tarefa tarefa = new Tarefa();

    // Instancia do Scanner
    Scanner teclado = new Scanner(System.in);

    // Instancia do Estado
    Estado estado = new Estado();

    // Instancia da ListaTarefas
    ListaTarefas listaTarefas = new ListaTarefas();
    int decision;

    public Estado CriarTarefa() {

        System.out.println("********************");
        System.out.println("    Criar Tarefa   ");
        System.out.println("********************");
        System.out.println("");

        System.out.println("Título: ");
        tarefa.titulo = teclado.nextLine();
        System.out.println("");

        System.out.println("Descrição: ");
        tarefa.descricao = teclado.nextLine();
        System.out.println("");

        System.out.println("Data de Vencimento");
        tarefa.dataVencimento = teclado.nextLine();
        System.out.println("");

        System.out.println("[1 - Concluído] - [2 - Não Concluído]");
        decision = teclado.nextInt();
        teclado.nextLine();
        estado.Estado(decision);
        System.out.println("");

        return estado;

    }



}
