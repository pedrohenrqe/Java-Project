package br.senai.sp.jandira;

public class Estado {

    public String Estado(int status) {

       String statusTarefa = "Concluída";

       switch (status) {
           case 1:
               break;

           case 2:
               statusTarefa = "Não Concluída";
               break;
       }

       return statusTarefa;

    }



}
