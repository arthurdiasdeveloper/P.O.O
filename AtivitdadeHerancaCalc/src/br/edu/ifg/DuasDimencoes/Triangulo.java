package br.edu.ifg.DuasDimencoes;

import br.edu.ifg.FormaDuasDimencoes;

public class Triangulo extends FormaDuasDimencoes {
	private double altura;
	private double base;
	


	public Triangulo(String nome, double perimetro, double area) {
		super(nome, perimetro, area);
		this.altura = altura;
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public static double calcAreaTriangulo(double altura, double base) {
		return (base * altura / 2);
	}
	
	
}
