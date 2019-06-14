package br.edu.fapi.ex01;

public class Circulo implements FormaGeometrica{

	@Override
	public double calcularArea(double valor) {
		// TODO Auto-generated method stub
		return 3.14 * Math.pow(valor, 2);
	}

	@Override
	public double calcularPerimetro(double valor) {
		// TODO Auto-generated method stub
		return (2 * 3.14) * valor;
	}
	
	

}