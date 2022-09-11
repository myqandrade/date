package application;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {

    public static void main(String[] args){

        String nome = "Mike";
        String saudacao;

        Locale brasil = new Locale("pt", "BR");

        //para pegar o horário
        var agora = LocalDateTime.now();

        //para pegar o dia da semana
        //LocalDateTime é um método estático que não precisa da instaciação de um objeto para ser usado
        var diaSemana = LocalDateTime.now().getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        if(agora.getHour() > 0 && agora.getHour() < 12){
            saudacao = "Bom dia";
        }
        else if(agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "Boa tarde";
        }
        else {
            saudacao = "Boa noite";
        }

        System.out.printf("Ola, %s. Hoje e %s, %s. %n", nome, diaSemana, saudacao.toUpperCase());
    }
}
