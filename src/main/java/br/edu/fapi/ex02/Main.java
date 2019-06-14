/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fapi.ex02;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Main {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double n1;
        double n2;
        int op;
        
        System.out.println("Digite o primeiro número: ");
        n1 = ler.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = ler.nextDouble();
        
        
        
        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        op = ler.nextInt();
        
        
        switch(op){
            case 1:
                Operacoes soma = new Soma();
                System.out.println("Resultado: " + soma.somar(n1, n2));
                break;
            case 2:
                Operacoes subtracao = new Subtracao();
                System.out.println("Resultado: " + subtracao.subtrair(n1, n2));
                break;
            case 3:
                Operacoes multiplicacao = new Multiplicacao();
                System.out.println("Resultado: " + multiplicacao.multiplicar(n1, n2));
                break;
            case 4:
                Operacoes divisao = new Divisao();
                System.out.println("Resultado: " + divisao.dividir(n1, n2));
                break;
            default:
                System.out.println("Não conheço essa opção.");
        }
        
        
    }
}
