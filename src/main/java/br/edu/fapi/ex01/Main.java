package br.edu.fapi.ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		double valor;
		
		System.out.println("Olá usuário");
		
		System.out.println("Vamos falar sobre o quadrado");
		System.out.print("Digite a altura do seu quadrado: ");
		valor = ler.nextDouble();
		
		FormaGeometrica quadrado = new Quadrado();
		System.out.println("A área do seu quadrado é " + quadrado.calcularArea(valor) + " e o seu perímetro é "+ quadrado.calcularPerimetro(valor) + ".");
		
		
		System.out.println("");
		
		System.out.println("Vamos falar sobre o círculo");
		System.out.print("Digite o raio do seu círculo: ");
		valor = ler.nextDouble();
		
		FormaGeometrica circulo = new Circulo();
		System.out.println("A área do seu círculo é " + circulo.calcularArea(valor) + " e o seu perímetro é "+ circulo.calcularPerimetro(valor) + ".");
	}

}
