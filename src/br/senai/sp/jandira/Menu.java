package br.senai.sp.jandira;

import java.util.Scanner;

public class Menu {

    Scanner telcado = new Scanner(System.in);

    ListaTarefas listaTarefas = new ListaTarefas();

    public void Menu(){
        boolean continuar = true;

        while (continuar){
            System.out.println("****************************************");
            System.out.println("********* Bem vindo(a) ao menu *********");
            System.out.println("****************************************");
            System.out.println("");
            System.out.println("Escolha uma opção~: ");
            System.out.println("[1- Criar tarefa 2 - Listar tarefas 3 - Atualizar tarefas]");

            int userOption = telcado.nextInt();
            System.out.println("");

            switch (userOption) {

                case 1:

                    break;

            }


        }


    }
    }
