package br.senai.sp.jandira;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaTarefas {

    Scanner teclado = new Scanner(System.in);

    Estado estado = new Estado();

    Tarefa tarefa = new Tarefa();

    private void EditarInfo() {
    }

    private void RemoverInfo() {
    }

    int i = 1, listaTarefas, Infos;

    List<Tarefa> list = new ArrayList<>();
    public void NovaTarefa(Tarefa tarefa){
        list.add(tarefa);
        listaTarefas = list.size();
    }

    public void ListaTarefas(){
        if (list.isEmpty()){
            System.out.println("Nenhuma tarefa cadastrada no momento.");
            System.out.println("");
        } else{

            for (Tarefa tarefa : list){
                System.out.println("Tarefa " + i);
                System.out.println("Titulo " + tarefa.titulo);
                System.out.println("Descrição " + tarefa.descricao);
                System.out.println("Data de Vencimento " + tarefa.dataVencimento);
                i++;
            }
        }
    }

    public void EditarInformacao(){
        if (list.isEmpty()){
            System.out.println("[1 - Editar Informações] - [2 - Excluir Informações]");

            switch (Infos){
                case 1:
                    EditarInfo();
                    break;

                case 2:
                    RemoverInfo();
                    break;
            }
        }
    }
}
