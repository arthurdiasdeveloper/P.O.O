package br.edu.ifg.DuasDimencoes;

import br.edu.ifg.FormaDuasDimencoes;

public class Quadrado extends FormaDuasDimencoes {
	
	private double lado;
	
	public Quadrado(String nome, double perimetro, double area) {
		super(nome, perimetro, area);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public static double calcLado(double lado) {
		return(lado * lado);
	}
	
	
}