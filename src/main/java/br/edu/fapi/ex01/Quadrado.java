package br.edu.fapi.ex01;

public class Quadrado implements FormaGeometrica{

	@Override
	public double calcularArea(double valor) {
		// TODO Auto-generated method stub
		return valor * valor;
	}

	@Override
	public double calcularPerimetro(double valor) {
		// TODO Auto-generated method stub
		return valor * 4;
	}
	

	

}
