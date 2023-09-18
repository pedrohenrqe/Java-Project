package br.senai.sp.jandira;

import java.util.Scanner;

public class CriarUsuario {

    Scanner teclado = new Scanner(System.in);

    Usuario usuario = new Usuario();

    private Usuario usuario() {
        Usuario o = null;
        return o;
    }

    public Usuario NovoUsuario (){
        System.out.println("Digite o Nome de Usuário: ");
        String nome = teclado.nextLine();
        return usuario();
    }


}
