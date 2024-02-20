package Desafios.Principal;

import Desafios.Principal.Classes.Calculadora;
import Desafios.Principal.Classes.Musica;
import Desafios.Principal.Classes.Pessoa;

public class Solucao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.imprimeMensagem();

        Calculadora calc = new Calculadora();
        System.out.println(calc.exibeDobro(2));

        Musica m1 = new Musica();


        m1.titulo = "Sonhador";
        m1.artista = "Hungria";
        m1.avaliaMusica(10);
        m1.avaliaMusica(9);
        m1.avaliaMusica(8);
        m1.

    }

}
