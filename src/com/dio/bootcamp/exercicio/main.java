package com.dio.bootcamp.exercicio;

public class main {

    public static void main(String[] args) {

        //calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(3, 4);
        Calculadora.subtracao(4, 3);
        Calculadora.multiplicacao(3, 4);
        Calculadora.divisao(4, 2);

        //mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.ObterMensagem(5);
        Mensagem.ObterMensagem(14);
        Mensagem.ObterMensagem(19);
        Mensagem.ObterMensagem(50);

        //Empréstimos
        System.out.println("Exercício Empréstimo");
        Emprestimo.Calcular(2000, 3);
        Emprestimo.Calcular(2000, 50);
        Emprestimo.Calcular(1500, 2);



    }




}
